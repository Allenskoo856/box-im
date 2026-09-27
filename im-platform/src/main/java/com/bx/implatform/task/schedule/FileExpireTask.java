package com.bx.implatform.task.schedule;

import cn.hutool.core.util.StrUtil;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.bx.implatform.annotation.RedisLock;
import com.bx.implatform.config.props.ObsProperties;
import com.bx.implatform.contant.RedisKey;
import com.bx.implatform.entity.FileInfo;
import com.bx.implatform.service.FileService;
import com.bx.implatform.thirdparty.ObsService;
import org.apache.commons.lang3.time.DateUtils;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import java.util.Date;
import java.util.List;

/**
 * 过期文件清理任务
 *
 * @author Blue
 * @version 1.0
 */
@Component
public class FileExpireTask {
    private static final org.slf4j.Logger log = org.slf4j.LoggerFactory.getLogger(FileExpireTask.class);
    private final FileService fileService;
    private final ObsService obsService;
    private final ObsProperties obsProps;

    @RedisLock(prefixKey = RedisKey.IM_LOCK_FILE_TASK)
    @Scheduled(cron = "0 0 3 * * ?")
    public void run() {
        log.info("【定时任务】过期文件处理...");
        int batchSize = 100;
        List<FileInfo> files = loadBatch(batchSize);
        while (true) {
            for (FileInfo fileInfo : files) {
                String url = fileInfo.getFilePath();
                if (!url.contains(obsProps.getBucketName())) {
                    continue;
                }
                String relativePath = url.substring(fileInfo.getFilePath().indexOf(obsProps.getBucketName()));
                String[] arr = relativePath.split("/");
                String bucket = obsProps.getBucketName();
                String path = arr[1];
                String fileNme = StrUtil.join("/", arr[2], arr[3]);
                if (obsService.isExist(bucket, path, fileNme)) {
                    if (!obsService.remove(bucket, path, fileNme)) {
                        // 删除失败，不再往下执行
                        log.error("删除过期文件异常, id:{},文件名:{}", fileInfo.getId(), fileInfo.getFileName());
                        return;
                    }
                    // 删除文件信息
                    fileService.removeById(fileInfo.getId());
                }
            }
            if (files.size() < batchSize) {
                break;
            }
            // 下一批
            files = loadBatch(batchSize);
        }
    }

    List<FileInfo> loadBatch(int size) {
        Date minDate = DateUtils.addDays(new Date(), -obsProps.getExpireIn());
        LambdaQueryWrapper<FileInfo> wrapper = Wrappers.lambdaQuery();
        wrapper.eq(FileInfo::getIsPermanent, false);
        wrapper.le(FileInfo::getUploadTime, minDate);
        wrapper.orderByAsc(FileInfo::getId);
        wrapper.last("limit " + size);
        return fileService.list(wrapper);
    }

    public FileExpireTask(final FileService fileService, final ObsService obsService, final ObsProperties obsProps) {
        this.fileService = fileService;
        this.obsService = obsService;
        this.obsProps = obsProps;
    }
}
