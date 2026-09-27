package com.bx.implatform.task.schedule;

import com.bx.implatform.util.SensitiveFilterUtil;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * @author: Blue
 * @date: 2024-09-01
 * @version: 1.0
 */
@Component
public class ReloadSensitiveWordTask {
    private static final org.slf4j.Logger log = org.slf4j.LoggerFactory.getLogger(ReloadSensitiveWordTask.class);
    private final SensitiveFilterUtil sensitiveFilterUtil;

    @Scheduled(fixedRate = 60000)
    public void run() {
        log.info("【定时任务】重新装载敏感词...");
        sensitiveFilterUtil.reload();
    }

    public ReloadSensitiveWordTask(final SensitiveFilterUtil sensitiveFilterUtil) {
        this.sensitiveFilterUtil = sensitiveFilterUtil;
    }
}
