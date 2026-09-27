package com.bx.implatform.vo;

import com.bx.imcommon.serializer.DateToLongSerializer;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.Date;

@Schema(description = "私聊消息VO")
public class PrivateMessageVO {
    @Schema(description = " 消息id")
    private Long id;
    @Schema(description = "本地消息id")
    private String localId;
    @Schema(description = "消息序列号，会话内连续递增")
    private Long seqNo;
    @Schema(description = " 发送者id")
    private Long sendId;
    @Schema(description = " 接收者id")
    private Long recvId;
    @Schema(description = " 发送内容")
    private String content;
    @Schema(description = "消息内容类型 MessageType")
    private Integer type;
    @Schema(description = " 状态")
    private Integer status;
    @Schema(description = " 发送时间")
    @JsonSerialize(using = DateToLongSerializer.class)
    private Date sendTime;
    @Schema(description = " 是否删除")
    private Boolean deleted;

    public PrivateMessageVO() {
    }

    public Long getId() {
        return this.id;
    }

    public String getLocalId() {
        return this.localId;
    }

    public Long getSeqNo() {
        return this.seqNo;
    }

    public Long getSendId() {
        return this.sendId;
    }

    public Long getRecvId() {
        return this.recvId;
    }

    public String getContent() {
        return this.content;
    }

    public Integer getType() {
        return this.type;
    }

    public Integer getStatus() {
        return this.status;
    }

    public Date getSendTime() {
        return this.sendTime;
    }

    public Boolean getDeleted() {
        return this.deleted;
    }

    public void setId(final Long id) {
        this.id = id;
    }

    public void setLocalId(final String localId) {
        this.localId = localId;
    }

    public void setSeqNo(final Long seqNo) {
        this.seqNo = seqNo;
    }

    public void setSendId(final Long sendId) {
        this.sendId = sendId;
    }

    public void setRecvId(final Long recvId) {
        this.recvId = recvId;
    }

    public void setContent(final String content) {
        this.content = content;
    }

    public void setType(final Integer type) {
        this.type = type;
    }

    public void setStatus(final Integer status) {
        this.status = status;
    }

    public void setSendTime(final Date sendTime) {
        this.sendTime = sendTime;
    }

    public void setDeleted(final Boolean deleted) {
        this.deleted = deleted;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object o) {
        if (o == this) return true;
        if (!(o instanceof PrivateMessageVO)) return false;
        final PrivateMessageVO other = (PrivateMessageVO) o;
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
        final java.lang.Object this$deleted = this.getDeleted();
        final java.lang.Object other$deleted = other.getDeleted();
        if (this$deleted == null ? other$deleted != null : !this$deleted.equals(other$deleted)) return false;
        final java.lang.Object this$localId = this.getLocalId();
        final java.lang.Object other$localId = other.getLocalId();
        if (this$localId == null ? other$localId != null : !this$localId.equals(other$localId)) return false;
        final java.lang.Object this$content = this.getContent();
        final java.lang.Object other$content = other.getContent();
        if (this$content == null ? other$content != null : !this$content.equals(other$content)) return false;
        final java.lang.Object this$sendTime = this.getSendTime();
        final java.lang.Object other$sendTime = other.getSendTime();
        if (this$sendTime == null ? other$sendTime != null : !this$sendTime.equals(other$sendTime)) return false;
        return true;
    }

    protected boolean canEqual(final java.lang.Object other) {
        return other instanceof PrivateMessageVO;
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
        final java.lang.Object $deleted = this.getDeleted();
        result = result * PRIME + ($deleted == null ? 43 : $deleted.hashCode());
        final java.lang.Object $localId = this.getLocalId();
        result = result * PRIME + ($localId == null ? 43 : $localId.hashCode());
        final java.lang.Object $content = this.getContent();
        result = result * PRIME + ($content == null ? 43 : $content.hashCode());
        final java.lang.Object $sendTime = this.getSendTime();
        result = result * PRIME + ($sendTime == null ? 43 : $sendTime.hashCode());
        return result;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "PrivateMessageVO(id=" + this.getId() + ", localId=" + this.getLocalId() + ", seqNo=" + this.getSeqNo() + ", sendId=" + this.getSendId() + ", recvId=" + this.getRecvId() + ", content=" + this.getContent() + ", type=" + this.getType() + ", status=" + this.getStatus() + ", sendTime=" + this.getSendTime() + ", deleted=" + this.getDeleted() + ")";
    }
}
