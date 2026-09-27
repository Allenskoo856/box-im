package com.bx.implatform.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;

/**
 * @author: Blue
 * @date: 2024-06-01
 * @version: 1.0
 */
@Schema(description = "发起群视频通话DTO")
public class WebrtcGroupCandidateDTO {
    @NotNull(message = "群聊id不可为空")
    @Schema(description = "群聊id")
    private Long groupId;
    @NotNull(message = "用户id不可为空")
    @Schema(description = "用户id")
    private Long userId;
    @NotEmpty(message = "candidate信息不可为空")
    @Schema(description = "candidate信息")
    private String candidate;

    public WebrtcGroupCandidateDTO() {
    }

    public Long getGroupId() {
        return this.groupId;
    }

    public Long getUserId() {
        return this.userId;
    }

    public String getCandidate() {
        return this.candidate;
    }

    public void setGroupId(final Long groupId) {
        this.groupId = groupId;
    }

    public void setUserId(final Long userId) {
        this.userId = userId;
    }

    public void setCandidate(final String candidate) {
        this.candidate = candidate;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object o) {
        if (o == this) return true;
        if (!(o instanceof WebrtcGroupCandidateDTO)) return false;
        final WebrtcGroupCandidateDTO other = (WebrtcGroupCandidateDTO) o;
        if (!other.canEqual((java.lang.Object) this)) return false;
        final java.lang.Object this$groupId = this.getGroupId();
        final java.lang.Object other$groupId = other.getGroupId();
        if (this$groupId == null ? other$groupId != null : !this$groupId.equals(other$groupId)) return false;
        final java.lang.Object this$userId = this.getUserId();
        final java.lang.Object other$userId = other.getUserId();
        if (this$userId == null ? other$userId != null : !this$userId.equals(other$userId)) return false;
        final java.lang.Object this$candidate = this.getCandidate();
        final java.lang.Object other$candidate = other.getCandidate();
        if (this$candidate == null ? other$candidate != null : !this$candidate.equals(other$candidate)) return false;
        return true;
    }

    protected boolean canEqual(final java.lang.Object other) {
        return other instanceof WebrtcGroupCandidateDTO;
    }

    @java.lang.Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final java.lang.Object $groupId = this.getGroupId();
        result = result * PRIME + ($groupId == null ? 43 : $groupId.hashCode());
        final java.lang.Object $userId = this.getUserId();
        result = result * PRIME + ($userId == null ? 43 : $userId.hashCode());
        final java.lang.Object $candidate = this.getCandidate();
        result = result * PRIME + ($candidate == null ? 43 : $candidate.hashCode());
        return result;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "WebrtcGroupCandidateDTO(groupId=" + this.getGroupId() + ", userId=" + this.getUserId() + ", candidate=" + this.getCandidate() + ")";
    }
}
