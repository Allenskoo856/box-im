package com.bx.implatform.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.util.Date;

/**
 * @author Blue
 * @version 1.0
 */
@TableName("im_file_info")
public class FileInfo {
    /**
     * 文件ID
     */
    @TableId
    private Long id;
    /**
     * 文件名
     */
    private String fileName;
    /**
     * 原始文件存储路径
     */
    private String filePath;
    /**
     * 压缩文件存储路径
     */
    private String compressedPath;
    /**
     * 封面文件路径
     */
    private String coverPath;
    /**
     * 原始文件大小(字节)
     */
    private Long fileSize;
    /**
     * 上传时间
     */
    private Date uploadTime;
    /**
     * 文件类型，枚举: FileType
     */
    private Integer fileType;
    /**
     * 是否永久存储
     */
    private Boolean isPermanent;
    /**
     * 文件MD5哈希值
     */
    private String md5;

    public FileInfo() {
    }

    /**
     * 文件ID
     */
    public Long getId() {
        return this.id;
    }

    /**
     * 文件名
     */
    public String getFileName() {
        return this.fileName;
    }

    /**
     * 原始文件存储路径
     */
    public String getFilePath() {
        return this.filePath;
    }

    /**
     * 压缩文件存储路径
     */
    public String getCompressedPath() {
        return this.compressedPath;
    }

    /**
     * 封面文件路径
     */
    public String getCoverPath() {
        return this.coverPath;
    }

    /**
     * 原始文件大小(字节)
     */
    public Long getFileSize() {
        return this.fileSize;
    }

    /**
     * 上传时间
     */
    public Date getUploadTime() {
        return this.uploadTime;
    }

    /**
     * 文件类型，枚举: FileType
     */
    public Integer getFileType() {
        return this.fileType;
    }

    /**
     * 是否永久存储
     */
    public Boolean getIsPermanent() {
        return this.isPermanent;
    }

    /**
     * 文件MD5哈希值
     */
    public String getMd5() {
        return this.md5;
    }

    /**
     * 文件ID
     */
    public void setId(final Long id) {
        this.id = id;
    }

    /**
     * 文件名
     */
    public void setFileName(final String fileName) {
        this.fileName = fileName;
    }

    /**
     * 原始文件存储路径
     */
    public void setFilePath(final String filePath) {
        this.filePath = filePath;
    }

    /**
     * 压缩文件存储路径
     */
    public void setCompressedPath(final String compressedPath) {
        this.compressedPath = compressedPath;
    }

    /**
     * 封面文件路径
     */
    public void setCoverPath(final String coverPath) {
        this.coverPath = coverPath;
    }

    /**
     * 原始文件大小(字节)
     */
    public void setFileSize(final Long fileSize) {
        this.fileSize = fileSize;
    }

    /**
     * 上传时间
     */
    public void setUploadTime(final Date uploadTime) {
        this.uploadTime = uploadTime;
    }

    /**
     * 文件类型，枚举: FileType
     */
    public void setFileType(final Integer fileType) {
        this.fileType = fileType;
    }

    /**
     * 是否永久存储
     */
    public void setIsPermanent(final Boolean isPermanent) {
        this.isPermanent = isPermanent;
    }

    /**
     * 文件MD5哈希值
     */
    public void setMd5(final String md5) {
        this.md5 = md5;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object o) {
        if (o == this) return true;
        if (!(o instanceof FileInfo)) return false;
        final FileInfo other = (FileInfo) o;
        if (!other.canEqual((java.lang.Object) this)) return false;
        final java.lang.Object this$id = this.getId();
        final java.lang.Object other$id = other.getId();
        if (this$id == null ? other$id != null : !this$id.equals(other$id)) return false;
        final java.lang.Object this$fileSize = this.getFileSize();
        final java.lang.Object other$fileSize = other.getFileSize();
        if (this$fileSize == null ? other$fileSize != null : !this$fileSize.equals(other$fileSize)) return false;
        final java.lang.Object this$fileType = this.getFileType();
        final java.lang.Object other$fileType = other.getFileType();
        if (this$fileType == null ? other$fileType != null : !this$fileType.equals(other$fileType)) return false;
        final java.lang.Object this$isPermanent = this.getIsPermanent();
        final java.lang.Object other$isPermanent = other.getIsPermanent();
        if (this$isPermanent == null ? other$isPermanent != null : !this$isPermanent.equals(other$isPermanent)) return false;
        final java.lang.Object this$fileName = this.getFileName();
        final java.lang.Object other$fileName = other.getFileName();
        if (this$fileName == null ? other$fileName != null : !this$fileName.equals(other$fileName)) return false;
        final java.lang.Object this$filePath = this.getFilePath();
        final java.lang.Object other$filePath = other.getFilePath();
        if (this$filePath == null ? other$filePath != null : !this$filePath.equals(other$filePath)) return false;
        final java.lang.Object this$compressedPath = this.getCompressedPath();
        final java.lang.Object other$compressedPath = other.getCompressedPath();
        if (this$compressedPath == null ? other$compressedPath != null : !this$compressedPath.equals(other$compressedPath)) return false;
        final java.lang.Object this$coverPath = this.getCoverPath();
        final java.lang.Object other$coverPath = other.getCoverPath();
        if (this$coverPath == null ? other$coverPath != null : !this$coverPath.equals(other$coverPath)) return false;
        final java.lang.Object this$uploadTime = this.getUploadTime();
        final java.lang.Object other$uploadTime = other.getUploadTime();
        if (this$uploadTime == null ? other$uploadTime != null : !this$uploadTime.equals(other$uploadTime)) return false;
        final java.lang.Object this$md5 = this.getMd5();
        final java.lang.Object other$md5 = other.getMd5();
        if (this$md5 == null ? other$md5 != null : !this$md5.equals(other$md5)) return false;
        return true;
    }

    protected boolean canEqual(final java.lang.Object other) {
        return other instanceof FileInfo;
    }

    @java.lang.Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final java.lang.Object $id = this.getId();
        result = result * PRIME + ($id == null ? 43 : $id.hashCode());
        final java.lang.Object $fileSize = this.getFileSize();
        result = result * PRIME + ($fileSize == null ? 43 : $fileSize.hashCode());
        final java.lang.Object $fileType = this.getFileType();
        result = result * PRIME + ($fileType == null ? 43 : $fileType.hashCode());
        final java.lang.Object $isPermanent = this.getIsPermanent();
        result = result * PRIME + ($isPermanent == null ? 43 : $isPermanent.hashCode());
        final java.lang.Object $fileName = this.getFileName();
        result = result * PRIME + ($fileName == null ? 43 : $fileName.hashCode());
        final java.lang.Object $filePath = this.getFilePath();
        result = result * PRIME + ($filePath == null ? 43 : $filePath.hashCode());
        final java.lang.Object $compressedPath = this.getCompressedPath();
        result = result * PRIME + ($compressedPath == null ? 43 : $compressedPath.hashCode());
        final java.lang.Object $coverPath = this.getCoverPath();
        result = result * PRIME + ($coverPath == null ? 43 : $coverPath.hashCode());
        final java.lang.Object $uploadTime = this.getUploadTime();
        result = result * PRIME + ($uploadTime == null ? 43 : $uploadTime.hashCode());
        final java.lang.Object $md5 = this.getMd5();
        result = result * PRIME + ($md5 == null ? 43 : $md5.hashCode());
        return result;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "FileInfo(id=" + this.getId() + ", fileName=" + this.getFileName() + ", filePath=" + this.getFilePath() + ", compressedPath=" + this.getCompressedPath() + ", coverPath=" + this.getCoverPath() + ", fileSize=" + this.getFileSize() + ", uploadTime=" + this.getUploadTime() + ", fileType=" + this.getFileType() + ", isPermanent=" + this.getIsPermanent() + ", md5=" + this.getMd5() + ")";
    }
}
