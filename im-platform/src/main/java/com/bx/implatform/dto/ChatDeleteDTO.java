package com.bx.implatform.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotNull;

/**
 * @author Blue
 * @version 1.0
 */
@Schema(description = "删除会话DTO")
public class ChatDeleteDTO {
    @NotNull(message = "会话id不可为空")
    @Schema(description = "会话id,即好友id/群id")
    private Long chatId;

    public ChatDeleteDTO() {
    }

    public Long getChatId() {
        return this.chatId;
    }

    public void setChatId(final Long chatId) {
        this.chatId = chatId;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object o) {
        if (o == this) return true;
        if (!(o instanceof ChatDeleteDTO)) return false;
        final ChatDeleteDTO other = (ChatDeleteDTO) o;
        if (!other.canEqual((java.lang.Object) this)) return false;
        final java.lang.Object this$chatId = this.getChatId();
        final java.lang.Object other$chatId = other.getChatId();
        if (this$chatId == null ? other$chatId != null : !this$chatId.equals(other$chatId)) return false;
        return true;
    }

    protected boolean canEqual(final java.lang.Object other) {
        return other instanceof ChatDeleteDTO;
    }

    @java.lang.Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final java.lang.Object $chatId = this.getChatId();
        result = result * PRIME + ($chatId == null ? 43 : $chatId.hashCode());
        return result;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "ChatDeleteDTO(chatId=" + this.getChatId() + ")";
    }
}
