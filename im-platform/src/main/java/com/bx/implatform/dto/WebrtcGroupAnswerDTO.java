package com.bx.implatform.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;

/**
 * @author: Blue
 * @date: 2024-06-01
 * @version: 1.0
 */
@Schema(description = "回复用户连接请求DTO")
public class WebrtcGroupAnswerDTO {
    @NotNull(message = "群聊id不可为空")
    @Schema(description = "群聊id")
    private Long groupId;
    @NotNull(message = "用户id不可为空")
    @Schema(description = "用户id,代表回复谁的连接请求")
    private Long userId;
    @NotEmpty(message = "anwer不可为空")
    @Schema(description = "用户本地anwer信息")
    private String answer;

    public WebrtcGroupAnswerDTO() {
    }

    public Long getGroupId() {
        return this.groupId;
    }

    public Long getUserId() {
        return this.userId;
    }

    public String getAnswer() {
        return this.answer;
    }

    public void setGroupId(final Long groupId) {
        this.groupId = groupId;
    }

    public void setUserId(final Long userId) {
        this.userId = userId;
    }

    public void setAnswer(final String answer) {
        this.answer = answer;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object o) {
        if (o == this) return true;
        if (!(o instanceof WebrtcGroupAnswerDTO)) return false;
        final WebrtcGroupAnswerDTO other = (WebrtcGroupAnswerDTO) o;
        if (!other.canEqual((java.lang.Object) this)) return false;
        final java.lang.Object this$groupId = this.getGroupId();
        final java.lang.Object other$groupId = other.getGroupId();
        if (this$groupId == null ? other$groupId != null : !this$groupId.equals(other$groupId)) return false;
        final java.lang.Object this$userId = this.getUserId();
        final java.lang.Object other$userId = other.getUserId();
        if (this$userId == null ? other$userId != null : !this$userId.equals(other$userId)) return false;
        final java.lang.Object this$answer = this.getAnswer();
        final java.lang.Object other$answer = other.getAnswer();
        if (this$answer == null ? other$answer != null : !this$answer.equals(other$answer)) return false;
        return true;
    }

    protected boolean canEqual(final java.lang.Object other) {
        return other instanceof WebrtcGroupAnswerDTO;
    }

    @java.lang.Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final java.lang.Object $groupId = this.getGroupId();
        result = result * PRIME + ($groupId == null ? 43 : $groupId.hashCode());
        final java.lang.Object $userId = this.getUserId();
        result = result * PRIME + ($userId == null ? 43 : $userId.hashCode());
        final java.lang.Object $answer = this.getAnswer();
        result = result * PRIME + ($answer == null ? 43 : $answer.hashCode());
        return result;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "WebrtcGroupAnswerDTO(groupId=" + this.getGroupId() + ", userId=" + this.getUserId() + ", answer=" + this.getAnswer() + ")";
    }
}
