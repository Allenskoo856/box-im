package com.bx.implatform.config.props;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * 华为云 OBS 配置属性
 *
 * @author Blue
 * @version 1.0
 */
@Component
@ConfigurationProperties(prefix = "obs")
public class ObsProperties {
    /**
     * OBS 终端节点（Endpoint），如 https://obs.cn-north-4.myhuaweicloud.com
     */
    private String endpoint;
    /**
     * Access Key (AK)
     */
    private String accessKey;
    /**
     * Secret Key (SK)
     */
    private String secretKey;
    /**
     * 外网访问域名（支持自定义 CDN 域名），如 https://obs.cn-north-4.myhuaweicloud.com
     */
    private String domain;
    /**
     * 桶名称
     */
    private String bucketName;
    /**
     * 图片存放路径前缀
     */
    private String imagePath = "image";
    /**
     * 文件存放路径前缀
     */
    private String filePath = "file";
    /**
     * 视频存放路径前缀
     */
    private String videoPath = "video";
    /**
     * 文件过期时间, 单位: 天
     */
    private Integer expireIn = 180;

    public ObsProperties() {
    }

    /**
     * OBS 终端节点（Endpoint），如 https://obs.cn-north-4.myhuaweicloud.com
     */
    public String getEndpoint() {
        return this.endpoint;
    }

    /**
     * Access Key (AK)
     */
    public String getAccessKey() {
        return this.accessKey;
    }

    /**
     * Secret Key (SK)
     */
    public String getSecretKey() {
        return this.secretKey;
    }

    /**
     * 外网访问域名（支持自定义 CDN 域名），如 https://obs.cn-north-4.myhuaweicloud.com
     */
    public String getDomain() {
        return this.domain;
    }

    /**
     * 桶名称
     */
    public String getBucketName() {
        return this.bucketName;
    }

    /**
     * 图片存放路径前缀
     */
    public String getImagePath() {
        return this.imagePath;
    }

    /**
     * 文件存放路径前缀
     */
    public String getFilePath() {
        return this.filePath;
    }

    /**
     * 视频存放路径前缀
     */
    public String getVideoPath() {
        return this.videoPath;
    }

    /**
     * 文件过期时间, 单位: 天
     */
    public Integer getExpireIn() {
        return this.expireIn;
    }

    /**
     * OBS 终端节点（Endpoint），如 https://obs.cn-north-4.myhuaweicloud.com
     */
    public void setEndpoint(final String endpoint) {
        this.endpoint = endpoint;
    }

    /**
     * Access Key (AK)
     */
    public void setAccessKey(final String accessKey) {
        this.accessKey = accessKey;
    }

    /**
     * Secret Key (SK)
     */
    public void setSecretKey(final String secretKey) {
        this.secretKey = secretKey;
    }

    /**
     * 外网访问域名（支持自定义 CDN 域名），如 https://obs.cn-north-4.myhuaweicloud.com
     */
    public void setDomain(final String domain) {
        this.domain = domain;
    }

    /**
     * 桶名称
     */
    public void setBucketName(final String bucketName) {
        this.bucketName = bucketName;
    }

    /**
     * 图片存放路径前缀
     */
    public void setImagePath(final String imagePath) {
        this.imagePath = imagePath;
    }

    /**
     * 文件存放路径前缀
     */
    public void setFilePath(final String filePath) {
        this.filePath = filePath;
    }

    /**
     * 视频存放路径前缀
     */
    public void setVideoPath(final String videoPath) {
        this.videoPath = videoPath;
    }

    /**
     * 文件过期时间, 单位: 天
     */
    public void setExpireIn(final Integer expireIn) {
        this.expireIn = expireIn;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object o) {
        if (o == this) return true;
        if (!(o instanceof ObsProperties)) return false;
        final ObsProperties other = (ObsProperties) o;
        if (!other.canEqual((java.lang.Object) this)) return false;
        final java.lang.Object this$expireIn = this.getExpireIn();
        final java.lang.Object other$expireIn = other.getExpireIn();
        if (this$expireIn == null ? other$expireIn != null : !this$expireIn.equals(other$expireIn)) return false;
        final java.lang.Object this$endpoint = this.getEndpoint();
        final java.lang.Object other$endpoint = other.getEndpoint();
        if (this$endpoint == null ? other$endpoint != null : !this$endpoint.equals(other$endpoint)) return false;
        final java.lang.Object this$accessKey = this.getAccessKey();
        final java.lang.Object other$accessKey = other.getAccessKey();
        if (this$accessKey == null ? other$accessKey != null : !this$accessKey.equals(other$accessKey)) return false;
        final java.lang.Object this$secretKey = this.getSecretKey();
        final java.lang.Object other$secretKey = other.getSecretKey();
        if (this$secretKey == null ? other$secretKey != null : !this$secretKey.equals(other$secretKey)) return false;
        final java.lang.Object this$domain = this.getDomain();
        final java.lang.Object other$domain = other.getDomain();
        if (this$domain == null ? other$domain != null : !this$domain.equals(other$domain)) return false;
        final java.lang.Object this$bucketName = this.getBucketName();
        final java.lang.Object other$bucketName = other.getBucketName();
        if (this$bucketName == null ? other$bucketName != null : !this$bucketName.equals(other$bucketName)) return false;
        final java.lang.Object this$imagePath = this.getImagePath();
        final java.lang.Object other$imagePath = other.getImagePath();
        if (this$imagePath == null ? other$imagePath != null : !this$imagePath.equals(other$imagePath)) return false;
        final java.lang.Object this$filePath = this.getFilePath();
        final java.lang.Object other$filePath = other.getFilePath();
        if (this$filePath == null ? other$filePath != null : !this$filePath.equals(other$filePath)) return false;
        final java.lang.Object this$videoPath = this.getVideoPath();
        final java.lang.Object other$videoPath = other.getVideoPath();
        if (this$videoPath == null ? other$videoPath != null : !this$videoPath.equals(other$videoPath)) return false;
        return true;
    }

    protected boolean canEqual(final java.lang.Object other) {
        return other instanceof ObsProperties;
    }

    @java.lang.Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final java.lang.Object $expireIn = this.getExpireIn();
        result = result * PRIME + ($expireIn == null ? 43 : $expireIn.hashCode());
        final java.lang.Object $endpoint = this.getEndpoint();
        result = result * PRIME + ($endpoint == null ? 43 : $endpoint.hashCode());
        final java.lang.Object $accessKey = this.getAccessKey();
        result = result * PRIME + ($accessKey == null ? 43 : $accessKey.hashCode());
        final java.lang.Object $secretKey = this.getSecretKey();
        result = result * PRIME + ($secretKey == null ? 43 : $secretKey.hashCode());
        final java.lang.Object $domain = this.getDomain();
        result = result * PRIME + ($domain == null ? 43 : $domain.hashCode());
        final java.lang.Object $bucketName = this.getBucketName();
        result = result * PRIME + ($bucketName == null ? 43 : $bucketName.hashCode());
        final java.lang.Object $imagePath = this.getImagePath();
        result = result * PRIME + ($imagePath == null ? 43 : $imagePath.hashCode());
        final java.lang.Object $filePath = this.getFilePath();
        result = result * PRIME + ($filePath == null ? 43 : $filePath.hashCode());
        final java.lang.Object $videoPath = this.getVideoPath();
        result = result * PRIME + ($videoPath == null ? 43 : $videoPath.hashCode());
        return result;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "ObsProperties(endpoint=" + this.getEndpoint() + ", accessKey=" + this.getAccessKey() + ", secretKey=" + this.getSecretKey() + ", domain=" + this.getDomain() + ", bucketName=" + this.getBucketName() + ", imagePath=" + this.getImagePath() + ", filePath=" + this.getFilePath() + ", videoPath=" + this.getVideoPath() + ", expireIn=" + this.getExpireIn() + ")";
    }
}
