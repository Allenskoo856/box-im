package com.bx.implatform.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotNull;

/**
 * @author: Blue
 * @date: 2024-06-01
 * @version: 1.0
 */
@Schema(description = "用户设备操作DTO")
public class WebrtcGroupDeviceDTO {
    @NotNull(message = "群聊id不可为空")
    @Schema(description = "群聊id")
    private Long groupId;
    @Schema(description = "是否开启摄像头")
    private Boolean isCamera;
    @Schema(description = "是否开启麦克风")
    private Boolean isMicroPhone;

    public WebrtcGroupDeviceDTO() {
    }

    public Long getGroupId() {
        return this.groupId;
    }

    public Boolean getIsCamera() {
        return this.isCamera;
    }

    public Boolean getIsMicroPhone() {
        return this.isMicroPhone;
    }

    public void setGroupId(final Long groupId) {
        this.groupId = groupId;
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
        if (!(o instanceof WebrtcGroupDeviceDTO)) return false;
        final WebrtcGroupDeviceDTO other = (WebrtcGroupDeviceDTO) o;
        if (!other.canEqual((java.lang.Object) this)) return false;
        final java.lang.Object this$groupId = this.getGroupId();
        final java.lang.Object other$groupId = other.getGroupId();
        if (this$groupId == null ? other$groupId != null : !this$groupId.equals(other$groupId)) return false;
        final java.lang.Object this$isCamera = this.getIsCamera();
        final java.lang.Object other$isCamera = other.getIsCamera();
        if (this$isCamera == null ? other$isCamera != null : !this$isCamera.equals(other$isCamera)) return false;
        final java.lang.Object this$isMicroPhone = this.getIsMicroPhone();
        final java.lang.Object other$isMicroPhone = other.getIsMicroPhone();
        if (this$isMicroPhone == null ? other$isMicroPhone != null : !this$isMicroPhone.equals(other$isMicroPhone)) return false;
        return true;
    }

    protected boolean canEqual(final java.lang.Object other) {
        return other instanceof WebrtcGroupDeviceDTO;
    }

    @java.lang.Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final java.lang.Object $groupId = this.getGroupId();
        result = result * PRIME + ($groupId == null ? 43 : $groupId.hashCode());
        final java.lang.Object $isCamera = this.getIsCamera();
        result = result * PRIME + ($isCamera == null ? 43 : $isCamera.hashCode());
        final java.lang.Object $isMicroPhone = this.getIsMicroPhone();
        result = result * PRIME + ($isMicroPhone == null ? 43 : $isMicroPhone.hashCode());
        return result;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "WebrtcGroupDeviceDTO(groupId=" + this.getGroupId() + ", isCamera=" + this.getIsCamera() + ", isMicroPhone=" + this.getIsMicroPhone() + ")";
    }
}
