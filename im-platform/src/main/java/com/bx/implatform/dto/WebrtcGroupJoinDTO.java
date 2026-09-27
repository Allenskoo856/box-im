package com.bx.implatform.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotNull;

/**
 * @author: Blue
 * @date: 2024-06-01
 * @version: 1.0
 */
@Schema(description = "进入群视频通话DTO")
public class WebrtcGroupJoinDTO {
    @NotNull(message = "群聊id不可为空")
    @Schema(description = "群聊id")
    private Long groupId;

    public WebrtcGroupJoinDTO() {
    }

    public Long getGroupId() {
        return this.groupId;
    }

    public void setGroupId(final Long groupId) {
        this.groupId = groupId;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object o) {
        if (o == this) return true;
        if (!(o instanceof WebrtcGroupJoinDTO)) return false;
        final WebrtcGroupJoinDTO other = (WebrtcGroupJoinDTO) o;
        if (!other.canEqual((java.lang.Object) this)) return false;
        final java.lang.Object this$groupId = this.getGroupId();
        final java.lang.Object other$groupId = other.getGroupId();
        if (this$groupId == null ? other$groupId != null : !this$groupId.equals(other$groupId)) return false;
        return true;
    }

    protected boolean canEqual(final java.lang.Object other) {
        return other instanceof WebrtcGroupJoinDTO;
    }

    @java.lang.Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final java.lang.Object $groupId = this.getGroupId();
        result = result * PRIME + ($groupId == null ? 43 : $groupId.hashCode());
        return result;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "WebrtcGroupJoinDTO(groupId=" + this.getGroupId() + ")";
    }
}
