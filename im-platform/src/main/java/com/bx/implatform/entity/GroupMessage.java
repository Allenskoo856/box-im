package com.bx.implatform.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.util.Date;

/**
 * <p>
 * 群消息
 * </p>
 *
 * @author blue
 * @since 2022-10-31
 */
@TableName("im_group_message")
public class GroupMessage {
    /**
     * id
     */
    @TableId
    private Long id;
    /**
     * 前端本地消息id,由前端生成
     */
    private String localId;
    /**
     * 消息序列号，单会话连续递增
     */
    private Long seqNo;
    /**
     * 群id
     */
    private Long groupId;
    /**
     * 发送用户id
     */
    private Long sendId;
    /**
     * 发送用户昵称
     */
    private String sendNickName;
    /**
     * @用户列表
     */
    private String atUserIds;
    /**
     * 发送内容
     */
    private String content;
    /**
     * 消息类型 MessageType
     */
    private Integer type;
    /**
     * 是否回执消息
     */
    private Boolean receipt;
    /**
     * 回执消息是否完成
     */
    private Boolean receiptOk;
    /**
     * 状态 MessageStatus
     */
    private Integer status;
    /**
     * 发送时间
     */
    private Date sendTime;

    public GroupMessage() {
    }

    /**
     * id
     */
    public Long getId() {
        return this.id;
    }

    /**
     * 前端本地消息id,由前端生成
     */
    public String getLocalId() {
        return this.localId;
    }

    /**
     * 消息序列号，单会话连续递增
     */
    public Long getSeqNo() {
        return this.seqNo;
    }

    /**
     * 群id
     */
    public Long getGroupId() {
        return this.groupId;
    }

    /**
     * 发送用户id
     */
    public Long getSendId() {
        return this.sendId;
    }

    /**
     * 发送用户昵称
     */
    public String getSendNickName() {
        return this.sendNickName;
    }

    /**
     * @用户列表
     */
    public String getAtUserIds() {
        return this.atUserIds;
    }

    /**
     * 发送内容
     */
    public String getContent() {
        return this.content;
    }

    /**
     * 消息类型 MessageType
     */
    public Integer getType() {
        return this.type;
    }

    /**
     * 是否回执消息
     */
    public Boolean getReceipt() {
        return this.receipt;
    }

    /**
     * 回执消息是否完成
     */
    public Boolean getReceiptOk() {
        return this.receiptOk;
    }

    /**
     * 状态 MessageStatus
     */
    public Integer getStatus() {
        return this.status;
    }

    /**
     * 发送时间
     */
    public Date getSendTime() {
        return this.sendTime;
    }

    /**
     * id
     */
    public void setId(final Long id) {
        this.id = id;
    }

    /**
     * 前端本地消息id,由前端生成
     */
    public void setLocalId(final String localId) {
        this.localId = localId;
    }

    /**
     * 消息序列号，单会话连续递增
     */
    public void setSeqNo(final Long seqNo) {
        this.seqNo = seqNo;
    }

    /**
     * 群id
     */
    public void setGroupId(final Long groupId) {
        this.groupId = groupId;
    }

    /**
     * 发送用户id
     */
    public void setSendId(final Long sendId) {
        this.sendId = sendId;
    }

    /**
     * 发送用户昵称
     */
    public void setSendNickName(final String sendNickName) {
        this.sendNickName = sendNickName;
    }

    /**
     * @用户列表
     */
    public void setAtUserIds(final String atUserIds) {
        this.atUserIds = atUserIds;
    }

    /**
     * 发送内容
     */
    public void setContent(final String content) {
        this.content = content;
    }

    /**
     * 消息类型 MessageType
     */
    public void setType(final Integer type) {
        this.type = type;
    }

    /**
     * 是否回执消息
     */
    public void setReceipt(final Boolean receipt) {
        this.receipt = receipt;
    }

    /**
     * 回执消息是否完成
     */
    public void setReceiptOk(final Boolean receiptOk) {
        this.receiptOk = receiptOk;
    }

    /**
     * 状态 MessageStatus
     */
    public void setStatus(final Integer status) {
        this.status = status;
    }

    /**
     * 发送时间
     */
    public void setSendTime(final Date sendTime) {
        this.sendTime = sendTime;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object o) {
        if (o == this) return true;
        if (!(o instanceof GroupMessage)) return false;
        final GroupMessage other = (GroupMessage) o;
        if (!other.canEqual((java.lang.Object) this)) return false;
        final java.lang.Object this$id = this.getId();
        final java.lang.Object other$id = other.getId();
        if (this$id == null ? other$id != null : !this$id.equals(other$id)) return false;
        final java.lang.Object this$seqNo = this.getSeqNo();
        final java.lang.Object other$seqNo = other.getSeqNo();
        if (this$seqNo == null ? other$seqNo != null : !this$seqNo.equals(other$seqNo)) return false;
        final java.lang.Object this$groupId = this.getGroupId();
        final java.lang.Object other$groupId = other.getGroupId();
        if (this$groupId == null ? other$groupId != null : !this$groupId.equals(other$groupId)) return false;
        final java.lang.Object this$sendId = this.getSendId();
        final java.lang.Object other$sendId = other.getSendId();
        if (this$sendId == null ? other$sendId != null : !this$sendId.equals(other$sendId)) return false;
        final java.lang.Object this$type = this.getType();
        final java.lang.Object other$type = other.getType();
        if (this$type == null ? other$type != null : !this$type.equals(other$type)) return false;
        final java.lang.Object this$receipt = this.getReceipt();
        final java.lang.Object other$receipt = other.getReceipt();
        if (this$receipt == null ? other$receipt != null : !this$receipt.equals(other$receipt)) return false;
        final java.lang.Object this$receiptOk = this.getReceiptOk();
        final java.lang.Object other$receiptOk = other.getReceiptOk();
        if (this$receiptOk == null ? other$receiptOk != null : !this$receiptOk.equals(other$receiptOk)) return false;
        final java.lang.Object this$status = this.getStatus();
        final java.lang.Object other$status = other.getStatus();
        if (this$status == null ? other$status != null : !this$status.equals(other$status)) return false;
        final java.lang.Object this$localId = this.getLocalId();
        final java.lang.Object other$localId = other.getLocalId();
        if (this$localId == null ? other$localId != null : !this$localId.equals(other$localId)) return false;
        final java.lang.Object this$sendNickName = this.getSendNickName();
        final java.lang.Object other$sendNickName = other.getSendNickName();
        if (this$sendNickName == null ? other$sendNickName != null : !this$sendNickName.equals(other$sendNickName)) return false;
        final java.lang.Object this$atUserIds = this.getAtUserIds();
        final java.lang.Object other$atUserIds = other.getAtUserIds();
        if (this$atUserIds == null ? other$atUserIds != null : !this$atUserIds.equals(other$atUserIds)) return false;
        final java.lang.Object this$content = this.getContent();
        final java.lang.Object other$content = other.getContent();
        if (this$content == null ? other$content != null : !this$content.equals(other$content)) return false;
        final java.lang.Object this$sendTime = this.getSendTime();
        final java.lang.Object other$sendTime = other.getSendTime();
        if (this$sendTime == null ? other$sendTime != null : !this$sendTime.equals(other$sendTime)) return false;
        return true;
    }

    protected boolean canEqual(final java.lang.Object other) {
        return other instanceof GroupMessage;
    }

    @java.lang.Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final java.lang.Object $id = this.getId();
        result = result * PRIME + ($id == null ? 43 : $id.hashCode());
        final java.lang.Object $seqNo = this.getSeqNo();
        result = result * PRIME + ($seqNo == null ? 43 : $seqNo.hashCode());
        final java.lang.Object $groupId = this.getGroupId();
        result = result * PRIME + ($groupId == null ? 43 : $groupId.hashCode());
        final java.lang.Object $sendId = this.getSendId();
        result = result * PRIME + ($sendId == null ? 43 : $sendId.hashCode());
        final java.lang.Object $type = this.getType();
        result = result * PRIME + ($type == null ? 43 : $type.hashCode());
        final java.lang.Object $receipt = this.getReceipt();
        result = result * PRIME + ($receipt == null ? 43 : $receipt.hashCode());
        final java.lang.Object $receiptOk = this.getReceiptOk();
        result = result * PRIME + ($receiptOk == null ? 43 : $receiptOk.hashCode());
        final java.lang.Object $status = this.getStatus();
        result = result * PRIME + ($status == null ? 43 : $status.hashCode());
        final java.lang.Object $localId = this.getLocalId();
        result = result * PRIME + ($localId == null ? 43 : $localId.hashCode());
        final java.lang.Object $sendNickName = this.getSendNickName();
        result = result * PRIME + ($sendNickName == null ? 43 : $sendNickName.hashCode());
        final java.lang.Object $atUserIds = this.getAtUserIds();
        result = result * PRIME + ($atUserIds == null ? 43 : $atUserIds.hashCode());
        final java.lang.Object $content = this.getContent();
        result = result * PRIME + ($content == null ? 43 : $content.hashCode());
        final java.lang.Object $sendTime = this.getSendTime();
        result = result * PRIME + ($sendTime == null ? 43 : $sendTime.hashCode());
        return result;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "GroupMessage(id=" + this.getId() + ", localId=" + this.getLocalId() + ", seqNo=" + this.getSeqNo() + ", groupId=" + this.getGroupId() + ", sendId=" + this.getSendId() + ", sendNickName=" + this.getSendNickName() + ", atUserIds=" + this.getAtUserIds() + ", content=" + this.getContent() + ", type=" + this.getType() + ", receipt=" + this.getReceipt() + ", receiptOk=" + this.getReceiptOk() + ", status=" + this.getStatus() + ", sendTime=" + this.getSendTime() + ")";
    }
}
