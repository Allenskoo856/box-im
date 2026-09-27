package com.bx.implatform.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.util.Date;

/**
 * 消息删除记录
 *
 * @author Blue
 * @date 2025-12-31
 */
@TableName("im_message_deletion")
public class MessageDeletion {
    /**
     * id
     */
    @TableId
    private Long id;
    /**
     * 用户id
     */
    private Long userId;
    /**
     * 会话类型 1:私聊 2:群聊
     */
    private Integer chatType;
    /**
     * 好友id、群聊id
     */
    private Long chatId;
    /**
     * 消息id
     */
    private Long messageId;
    /**
     * 删除类型 1:按消息删除 2:按会话删除
     */
    private Integer deleteType;
    /**
     * 消息删除时间
     */
    private Date deleteTime;

    public MessageDeletion() {
    }

    /**
     * id
     */
    public Long getId() {
        return this.id;
    }

    /**
     * 用户id
     */
    public Long getUserId() {
        return this.userId;
    }

    /**
     * 会话类型 1:私聊 2:群聊
     */
    public Integer getChatType() {
        return this.chatType;
    }

    /**
     * 好友id、群聊id
     */
    public Long getChatId() {
        return this.chatId;
    }

    /**
     * 消息id
     */
    public Long getMessageId() {
        return this.messageId;
    }

    /**
     * 删除类型 1:按消息删除 2:按会话删除
     */
    public Integer getDeleteType() {
        return this.deleteType;
    }

    /**
     * 消息删除时间
     */
    public Date getDeleteTime() {
        return this.deleteTime;
    }

    /**
     * id
     */
    public void setId(final Long id) {
        this.id = id;
    }

    /**
     * 用户id
     */
    public void setUserId(final Long userId) {
        this.userId = userId;
    }

    /**
     * 会话类型 1:私聊 2:群聊
     */
    public void setChatType(final Integer chatType) {
        this.chatType = chatType;
    }

    /**
     * 好友id、群聊id
     */
    public void setChatId(final Long chatId) {
        this.chatId = chatId;
    }

    /**
     * 消息id
     */
    public void setMessageId(final Long messageId) {
        this.messageId = messageId;
    }

    /**
     * 删除类型 1:按消息删除 2:按会话删除
     */
    public void setDeleteType(final Integer deleteType) {
        this.deleteType = deleteType;
    }

    /**
     * 消息删除时间
     */
    public void setDeleteTime(final Date deleteTime) {
        this.deleteTime = deleteTime;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object o) {
        if (o == this) return true;
        if (!(o instanceof MessageDeletion)) return false;
        final MessageDeletion other = (MessageDeletion) o;
        if (!other.canEqual((java.lang.Object) this)) return false;
        final java.lang.Object this$id = this.getId();
        final java.lang.Object other$id = other.getId();
        if (this$id == null ? other$id != null : !this$id.equals(other$id)) return false;
        final java.lang.Object this$userId = this.getUserId();
        final java.lang.Object other$userId = other.getUserId();
        if (this$userId == null ? other$userId != null : !this$userId.equals(other$userId)) return false;
        final java.lang.Object this$chatType = this.getChatType();
        final java.lang.Object other$chatType = other.getChatType();
        if (this$chatType == null ? other$chatType != null : !this$chatType.equals(other$chatType)) return false;
        final java.lang.Object this$chatId = this.getChatId();
        final java.lang.Object other$chatId = other.getChatId();
        if (this$chatId == null ? other$chatId != null : !this$chatId.equals(other$chatId)) return false;
        final java.lang.Object this$messageId = this.getMessageId();
        final java.lang.Object other$messageId = other.getMessageId();
        if (this$messageId == null ? other$messageId != null : !this$messageId.equals(other$messageId)) return false;
        final java.lang.Object this$deleteType = this.getDeleteType();
        final java.lang.Object other$deleteType = other.getDeleteType();
        if (this$deleteType == null ? other$deleteType != null : !this$deleteType.equals(other$deleteType)) return false;
        final java.lang.Object this$deleteTime = this.getDeleteTime();
        final java.lang.Object other$deleteTime = other.getDeleteTime();
        if (this$deleteTime == null ? other$deleteTime != null : !this$deleteTime.equals(other$deleteTime)) return false;
        return true;
    }

    protected boolean canEqual(final java.lang.Object other) {
        return other instanceof MessageDeletion;
    }

    @java.lang.Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final java.lang.Object $id = this.getId();
        result = result * PRIME + ($id == null ? 43 : $id.hashCode());
        final java.lang.Object $userId = this.getUserId();
        result = result * PRIME + ($userId == null ? 43 : $userId.hashCode());
        final java.lang.Object $chatType = this.getChatType();
        result = result * PRIME + ($chatType == null ? 43 : $chatType.hashCode());
        final java.lang.Object $chatId = this.getChatId();
        result = result * PRIME + ($chatId == null ? 43 : $chatId.hashCode());
        final java.lang.Object $messageId = this.getMessageId();
        result = result * PRIME + ($messageId == null ? 43 : $messageId.hashCode());
        final java.lang.Object $deleteType = this.getDeleteType();
        result = result * PRIME + ($deleteType == null ? 43 : $deleteType.hashCode());
        final java.lang.Object $deleteTime = this.getDeleteTime();
        result = result * PRIME + ($deleteTime == null ? 43 : $deleteTime.hashCode());
        return result;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "MessageDeletion(id=" + this.getId() + ", userId=" + this.getUserId() + ", chatType=" + this.getChatType() + ", chatId=" + this.getChatId() + ", messageId=" + this.getMessageId() + ", deleteType=" + this.getDeleteType() + ", deleteTime=" + this.getDeleteTime() + ")";
    }
}
