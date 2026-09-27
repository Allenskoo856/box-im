package com.bx.implatform.vo;

import io.swagger.v3.oas.annotations.media.Schema;

@Schema(description = "图片上传VO")
public class UploadImageVO {
    @Schema(description = "原图")
    private String originUrl;
    @Schema(description = "缩略图")
    private String thumbUrl;
    @Schema(description = "图片宽度")
    private int width;
    @Schema(description = "图片高度")
    private int height;

    public UploadImageVO() {
    }

    public String getOriginUrl() {
        return this.originUrl;
    }

    public String getThumbUrl() {
        return this.thumbUrl;
    }

    public int getWidth() {
        return this.width;
    }

    public int getHeight() {
        return this.height;
    }

    public void setOriginUrl(final String originUrl) {
        this.originUrl = originUrl;
    }

    public void setThumbUrl(final String thumbUrl) {
        this.thumbUrl = thumbUrl;
    }

    public void setWidth(final int width) {
        this.width = width;
    }

    public void setHeight(final int height) {
        this.height = height;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object o) {
        if (o == this) return true;
        if (!(o instanceof UploadImageVO)) return false;
        final UploadImageVO other = (UploadImageVO) o;
        if (!other.canEqual((java.lang.Object) this)) return false;
        if (this.getWidth() != other.getWidth()) return false;
        if (this.getHeight() != other.getHeight()) return false;
        final java.lang.Object this$originUrl = this.getOriginUrl();
        final java.lang.Object other$originUrl = other.getOriginUrl();
        if (this$originUrl == null ? other$originUrl != null : !this$originUrl.equals(other$originUrl)) return false;
        final java.lang.Object this$thumbUrl = this.getThumbUrl();
        final java.lang.Object other$thumbUrl = other.getThumbUrl();
        if (this$thumbUrl == null ? other$thumbUrl != null : !this$thumbUrl.equals(other$thumbUrl)) return false;
        return true;
    }

    protected boolean canEqual(final java.lang.Object other) {
        return other instanceof UploadImageVO;
    }

    @java.lang.Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = result * PRIME + this.getWidth();
        result = result * PRIME + this.getHeight();
        final java.lang.Object $originUrl = this.getOriginUrl();
        result = result * PRIME + ($originUrl == null ? 43 : $originUrl.hashCode());
        final java.lang.Object $thumbUrl = this.getThumbUrl();
        result = result * PRIME + ($thumbUrl == null ? 43 : $thumbUrl.hashCode());
        return result;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "UploadImageVO(originUrl=" + this.getOriginUrl() + ", thumbUrl=" + this.getThumbUrl() + ", width=" + this.getWidth() + ", height=" + this.getHeight() + ")";
    }
}
