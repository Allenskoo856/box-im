package com.bx.implatform.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotNull;

/**
 * @author: Blue
 * @date: 2024-06-01
 * @version: 1.0
 */
@Schema(description = "用户通话失败DTO")
public class WebrtcGroupFailedDTO {
    @NotNull(message = "群聊id不可为空")
    @Schema(description = "群聊id")
    private Long groupId;
    @Schema(description = "失败原因")
    private String reason;

    public WebrtcGroupFailedDTO() {
    }

    public Long getGroupId() {
        return this.groupId;
    }

    public String getReason() {
        return this.reason;
    }

    public void setGroupId(final Long groupId) {
        this.groupId = groupId;
    }

    public void setReason(final String reason) {
        this.reason = reason;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object o) {
        if (o == this) return true;
        if (!(o instanceof WebrtcGroupFailedDTO)) return false;
        final WebrtcGroupFailedDTO other = (WebrtcGroupFailedDTO) o;
        if (!other.canEqual((java.lang.Object) this)) return false;
        final java.lang.Object this$groupId = this.getGroupId();
        final java.lang.Object other$groupId = other.getGroupId();
        if (this$groupId == null ? other$groupId != null : !this$groupId.equals(other$groupId)) return false;
        final java.lang.Object this$reason = this.getReason();
        final java.lang.Object other$reason = other.getReason();
        if (this$reason == null ? other$reason != null : !this$reason.equals(other$reason)) return false;
        return true;
    }

    protected boolean canEqual(final java.lang.Object other) {
        return other instanceof WebrtcGroupFailedDTO;
    }

    @java.lang.Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final java.lang.Object $groupId = this.getGroupId();
        result = result * PRIME + ($groupId == null ? 43 : $groupId.hashCode());
        final java.lang.Object $reason = this.getReason();
        result = result * PRIME + ($reason == null ? 43 : $reason.hashCode());
        return result;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "WebrtcGroupFailedDTO(groupId=" + this.getGroupId() + ", reason=" + this.getReason() + ")";
    }
}
