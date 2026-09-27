package com.bx.implatform.session;

import io.swagger.v3.oas.annotations.media.Schema;

/**
 * @author: Blue
 * @date: 2024-06-02
 * @version: 1.0
 */
@Schema(description = "用户信息")
public class WebrtcUserInfo {
    @Schema(description = "用户id")
    private Long id;
    @Schema(description = "用户昵称")
    private String nickName;
    @Schema(description = "用户头像")
    private String headImage;
    @Schema(description = "是否开启摄像头")
    private Boolean isCamera;
    @Schema(description = "是否开启麦克风")
    private Boolean isMicroPhone;

    public WebrtcUserInfo() {
    }

    public Long getId() {
        return this.id;
    }

    public String getNickName() {
        return this.nickName;
    }

    public String getHeadImage() {
        return this.headImage;
    }

    public Boolean getIsCamera() {
        return this.isCamera;
    }

    public Boolean getIsMicroPhone() {
        return this.isMicroPhone;
    }

    public void setId(final Long id) {
        this.id = id;
    }

    public void setNickName(final String nickName) {
        this.nickName = nickName;
    }

    public void setHeadImage(final String headImage) {
        this.headImage = headImage;
    }

    public void setIsCamera(final Boolean isCamera) {
        this.isCamera = isCamera;
    }

    public void setIsMicroPhone(final Boolean isMicroPhone) {
        this.isMicroPhone = isMicroPhone;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object o) {
        if (o == this) return true;
        if (!(o instanceof WebrtcUserInfo)) return false;
        final WebrtcUserInfo other = (WebrtcUserInfo) o;
        if (!other.canEqual((java.lang.Object) this)) return false;
        final java.lang.Object this$id = this.getId();
        final java.lang.Object other$id = other.getId();
        if (this$id == null ? other$id != null : !this$id.equals(other$id)) return false;
        final java.lang.Object this$isCamera = this.getIsCamera();
        final java.lang.Object other$isCamera = other.getIsCamera();
        if (this$isCamera == null ? other$isCamera != null : !this$isCamera.equals(other$isCamera)) return false;
        final java.lang.Object this$isMicroPhone = this.getIsMicroPhone();
        final java.lang.Object other$isMicroPhone = other.getIsMicroPhone();
        if (this$isMicroPhone == null ? other$isMicroPhone != null : !this$isMicroPhone.equals(other$isMicroPhone)) return false;
        final java.lang.Object this$nickName = this.getNickName();
        final java.lang.Object other$nickName = other.getNickName();
        if (this$nickName == null ? other$nickName != null : !this$nickName.equals(other$nickName)) return false;
        final java.lang.Object this$headImage = this.getHeadImage();
        final java.lang.Object other$headImage = other.getHeadImage();
        if (this$headImage == null ? other$headImage != null : !this$headImage.equals(other$headImage)) return false;
        return true;
    }

    protected boolean canEqual(final java.lang.Object other) {
        return other instanceof WebrtcUserInfo;
    }

    @java.lang.Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final java.lang.Object $id = this.getId();
        result = result * PRIME + ($id == null ? 43 : $id.hashCode());
        final java.lang.Object $isCamera = this.getIsCamera();
        result = result * PRIME + ($isCamera == null ? 43 : $isCamera.hashCode());
        final java.lang.Object $isMicroPhone = this.getIsMicroPhone();
        result = result * PRIME + ($isMicroPhone == null ? 43 : $isMicroPhone.hashCode());
        final java.lang.Object $nickName = this.getNickName();
        result = result * PRIME + ($nickName == null ? 43 : $nickName.hashCode());
        final java.lang.Object $headImage = this.getHeadImage();
        result = result * PRIME + ($headImage == null ? 43 : $headImage.hashCode());
        return result;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "WebrtcUserInfo(id=" + this.getId() + ", nickName=" + this.getNickName() + ", headImage=" + this.getHeadImage() + ", isCamera=" + this.getIsCamera() + ", isMicroPhone=" + this.getIsMicroPhone() + ")";
    }
}
