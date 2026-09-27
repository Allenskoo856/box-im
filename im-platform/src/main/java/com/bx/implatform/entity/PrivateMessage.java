package com.bx.implatform.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import java.util.Date;

/**
 * <p>
 *
 * </p>
 *
 * @author blue
 * @since 2022-10-01
 */
@TableName("im_private_message")
public class PrivateMessage {
    /**
     * id
     */
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
     * 发送用户id
     */
    private Long sendId;
    /**
     * 接收用户id
     */
    private Long recvId;
    /**
     * 会话key, 格式:userId1_userId2,注意跟前端的conv_key格式不一致
     */
    private String convKey;
    /**
     * 发送内容
     */
    private String content;
    /**
     * 消息类型 MessageType
     */
    private Integer type;
    /**
     * 状态
     */
    private Integer status;
    /**
     * 发送时间
     */
    private Date sendTime;

    public PrivateMessage() {
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
     * 发送用户id
     */
    public Long getSendId() {
        return this.sendId;
    }

    /**
     * 接收用户id
     */
    public Long getRecvId() {
        return this.recvId;
    }

    /**
     * 会话key, 格式:userId1_userId2,注意跟前端的conv_key格式不一致
     */
    public String getConvKey() {
        return this.convKey;
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
     * 状态
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
     * 发送用户id
     */
    public void setSendId(final Long sendId) {
        this.sendId = sendId;
    }

    /**
     * 接收用户id
     */
    public void setRecvId(final Long recvId) {
        this.recvId = recvId;
    }

    /**
     * 会话key, 格式:userId1_userId2,注意跟前端的conv_key格式不一致
     */
    public void setConvKey(final String convKey) {
        this.convKey = convKey;
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
     * 状态
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
        if (!(o instanceof PrivateMessage)) return false;
        final PrivateMessage other = (PrivateMessage) o;
        if (!other.canEqual((java.lang.Object) this)) return false;
        final java.lang.Object this$id = this.getId();
        final java.lang.Object other$id = other.getId();
        if (this$id == null ? other$id != null : !this$id.equals(other$id)) return false;
        final java.lang.Object this$seqNo = this.getSeqNo();
        final java.lang.Object other$seqNo = other.getSeqNo();
        if (this$seqNo == null ? other$seqNo != null : !this$seqNo.equals(other$seqNo)) return false;
        final java.lang.Object this$sendId = this.getSendId();
        final java.lang.Object other$sendId = other.getSendId();
        if (this$sendId == null ? other$sendId != null : !this$sendId.equals(other$sendId)) return false;
        final java.lang.Object this$recvId = this.getRecvId();
        final java.lang.Object other$recvId = other.getRecvId();
        if (this$recvId == null ? other$recvId != null : !this$recvId.equals(other$recvId)) return false;
        final java.lang.Object this$type = this.getType();
        final java.lang.Object other$type = other.getType();
        if (this$type == null ? other$type != null : !this$type.equals(other$type)) return false;
        final java.lang.Object this$status = this.getStatus();
        final java.lang.Object other$status = other.getStatus();
        if (this$status == null ? other$status != null : !this$status.equals(other$status)) return false;
        final java.lang.Object this$localId = this.getLocalId();
        final java.lang.Object other$localId = other.getLocalId();
        if (this$localId == null ? other$localId != null : !this$localId.equals(other$localId)) return false;
        final java.lang.Object this$convKey = this.getConvKey();
        final java.lang.Object other$convKey = other.getConvKey();
        if (this$convKey == null ? other$convKey != null : !this$convKey.equals(other$convKey)) return false;
        final java.lang.Object this$content = this.getContent();
        final java.lang.Object other$content = other.getContent();
        if (this$content == null ? other$content != null : !this$content.equals(other$content)) return false;
        final java.lang.Object this$sendTime = this.getSendTime();
        final java.lang.Object other$sendTime = other.getSendTime();
        if (this$sendTime == null ? other$sendTime != null : !this$sendTime.equals(other$sendTime)) return false;
        return true;
    }

    protected boolean canEqual(final java.lang.Object other) {
        return other instanceof PrivateMessage;
    }

    @java.lang.Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final java.lang.Object $id = this.getId();
        result = result * PRIME + ($id == null ? 43 : $id.hashCode());
        final java.lang.Object $seqNo = this.getSeqNo();
        result = result * PRIME + ($seqNo == null ? 43 : $seqNo.hashCode());
        final java.lang.Object $sendId = this.getSendId();
        result = result * PRIME + ($sendId == null ? 43 : $sendId.hashCode());
        final java.lang.Object $recvId = this.getRecvId();
        result = result * PRIME + ($recvId == null ? 43 : $recvId.hashCode());
        final java.lang.Object $type = this.getType();
        result = result * PRIME + ($type == null ? 43 : $type.hashCode());
        final java.lang.Object $status = this.getStatus();
        result = result * PRIME + ($status == null ? 43 : $status.hashCode());
        final java.lang.Object $localId = this.getLocalId();
        result = result * PRIME + ($localId == null ? 43 : $localId.hashCode());
        final java.lang.Object $convKey = this.getConvKey();
        result = result * PRIME + ($convKey == null ? 43 : $convKey.hashCode());
        final java.lang.Object $content = this.getContent();
        result = result * PRIME + ($content == null ? 43 : $content.hashCode());
        final java.lang.Object $sendTime = this.getSendTime();
        result = result * PRIME + ($sendTime == null ? 43 : $sendTime.hashCode());
        return result;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "PrivateMessage(id=" + this.getId() + ", localId=" + this.getLocalId() + ", seqNo=" + this.getSeqNo() + ", sendId=" + this.getSendId() + ", recvId=" + this.getRecvId() + ", convKey=" + this.getConvKey() + ", content=" + this.getContent() + ", type=" + this.getType() + ", status=" + this.getStatus() + ", sendTime=" + this.getSendTime() + ")";
    }
}
