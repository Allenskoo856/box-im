package com.bx.implatform.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import java.util.List;

/**
 * @author Blue
 * @version 1.0
 */
@Schema(description = "删除消息DTO")
public class MessageDeleteDTO {
    @NotNull(message = "会话id不可为空")
    @Schema(description = "会话id,即好友id/群id")
    private Long chatId;
    @NotEmpty(message = "消息id不可为空")
    @Schema(description = "消息id")
    private List<Long> messageIds;

    public MessageDeleteDTO() {
    }

    public Long getChatId() {
        return this.chatId;
    }

    public List<Long> getMessageIds() {
        return this.messageIds;
    }

    public void setChatId(final Long chatId) {
        this.chatId = chatId;
    }

    public void setMessageIds(final List<Long> messageIds) {
        this.messageIds = messageIds;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object o) {
        if (o == this) return true;
        if (!(o instanceof MessageDeleteDTO)) return false;
        final MessageDeleteDTO other = (MessageDeleteDTO) o;
        if (!other.canEqual((java.lang.Object) this)) return false;
        final java.lang.Object this$chatId = this.getChatId();
        final java.lang.Object other$chatId = other.getChatId();
        if (this$chatId == null ? other$chatId != null : !this$chatId.equals(other$chatId)) return false;
        final java.lang.Object this$messageIds = this.getMessageIds();
        final java.lang.Object other$messageIds = other.getMessageIds();
        if (this$messageIds == null ? other$messageIds != null : !this$messageIds.equals(other$messageIds)) return false;
        return true;
    }

    protected boolean canEqual(final java.lang.Object other) {
        return other instanceof MessageDeleteDTO;
    }

    @java.lang.Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final java.lang.Object $chatId = this.getChatId();
        result = result * PRIME + ($chatId == null ? 43 : $chatId.hashCode());
        final java.lang.Object $messageIds = this.getMessageIds();
        result = result * PRIME + ($messageIds == null ? 43 : $messageIds.hashCode());
        return result;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "MessageDeleteDTO(chatId=" + this.getChatId() + ", messageIds=" + this.getMessageIds() + ")";
    }
}
