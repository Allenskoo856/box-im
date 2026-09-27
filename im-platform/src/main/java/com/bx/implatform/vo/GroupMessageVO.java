package com.bx.implatform.vo;

import com.bx.imcommon.serializer.DateToLongSerializer;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.Date;
import java.util.List;

public class GroupMessageVO {
    @Schema(description = "消息id")
    private Long id;
    @Schema(description = "本地消息id")
    private String localId;
    @Schema(description = "消息序列号，会话内连续递增")
    private Long seqNo;
    @Schema(description = "群聊id")
    private Long groupId;
    @Schema(description = " 发送者id")
    private Long sendId;
    @Schema(description = " 发送者昵称")
    private String sendNickName;
    @Schema(description = "消息内容")
    private String content;
    @Schema(description = "消息内容类型 具体枚举值由应用层定义")
    private Integer type;
    @Schema(description = "是否回执消息")
    private Boolean receipt;
    @Schema(description = "回执消息是否完成")
    private Boolean receiptOk;
    @Schema(description = "已读消息数量")
    private Integer readedCount = 0;
    @Schema(description = "@用户列表")
    private List<Long> atUserIds;
    @Schema(description = " 状态")
    private Integer status;
    @Schema(description = "发送时间")
    @JsonSerialize(using = DateToLongSerializer.class)
    private Date sendTime;
    @Schema(description = " 是否删除")
    private Boolean deleted;

    public GroupMessageVO() {
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

    public Long getGroupId() {
        return this.groupId;
    }

    public Long getSendId() {
        return this.sendId;
    }

    public String getSendNickName() {
        return this.sendNickName;
    }

    public String getContent() {
        return this.content;
    }

    public Integer getType() {
        return this.type;
    }

    public Boolean getReceipt() {
        return this.receipt;
    }

    public Boolean getReceiptOk() {
        return this.receiptOk;
    }

    public Integer getReadedCount() {
        return this.readedCount;
    }

    public List<Long> getAtUserIds() {
        return this.atUserIds;
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

    public void setGroupId(final Long groupId) {
        this.groupId = groupId;
    }

    public void setSendId(final Long sendId) {
        this.sendId = sendId;
    }

    public void setSendNickName(final String sendNickName) {
        this.sendNickName = sendNickName;
    }

    public void setContent(final String content) {
        this.content = content;
    }

    public void setType(final Integer type) {
        this.type = type;
    }

    public void setReceipt(final Boolean receipt) {
        this.receipt = receipt;
    }

    public void setReceiptOk(final Boolean receiptOk) {
        this.receiptOk = receiptOk;
    }

    public void setReadedCount(final Integer readedCount) {
        this.readedCount = readedCount;
    }

    public void setAtUserIds(final List<Long> atUserIds) {
        this.atUserIds = atUserIds;
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
        if (!(o instanceof GroupMessageVO)) return false;
        final GroupMessageVO other = (GroupMessageVO) o;
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
        final java.lang.Object this$readedCount = this.getReadedCount();
        final java.lang.Object other$readedCount = other.getReadedCount();
        if (this$readedCount == null ? other$readedCount != null : !this$readedCount.equals(other$readedCount)) return false;
        final java.lang.Object this$status = this.getStatus();
        final java.lang.Object other$status = other.getStatus();
        if (this$status == null ? other$status != null : !this$status.equals(other$status)) return false;
        final java.lang.Object this$deleted = this.getDeleted();
        final java.lang.Object other$deleted = other.getDeleted();
        if (this$deleted == null ? other$deleted != null : !this$deleted.equals(other$deleted)) return false;
        final java.lang.Object this$localId = this.getLocalId();
        final java.lang.Object other$localId = other.getLocalId();
        if (this$localId == null ? other$localId != null : !this$localId.equals(other$localId)) return false;
        final java.lang.Object this$sendNickName = this.getSendNickName();
        final java.lang.Object other$sendNickName = other.getSendNickName();
        if (this$sendNickName == null ? other$sendNickName != null : !this$sendNickName.equals(other$sendNickName)) return false;
        final java.lang.Object this$content = this.getContent();
        final java.lang.Object other$content = other.getContent();
        if (this$content == null ? other$content != null : !this$content.equals(other$content)) return false;
        final java.lang.Object this$atUserIds = this.getAtUserIds();
        final java.lang.Object other$atUserIds = other.getAtUserIds();
        if (this$atUserIds == null ? other$atUserIds != null : !this$atUserIds.equals(other$atUserIds)) return false;
        final java.lang.Object this$sendTime = this.getSendTime();
        final java.lang.Object other$sendTime = other.getSendTime();
        if (this$sendTime == null ? other$sendTime != null : !this$sendTime.equals(other$sendTime)) return false;
        return true;
    }

    protected boolean canEqual(final java.lang.Object other) {
        return other instanceof GroupMessageVO;
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
        final java.lang.Object $readedCount = this.getReadedCount();
        result = result * PRIME + ($readedCount == null ? 43 : $readedCount.hashCode());
        final java.lang.Object $status = this.getStatus();
        result = result * PRIME + ($status == null ? 43 : $status.hashCode());
        final java.lang.Object $deleted = this.getDeleted();
        result = result * PRIME + ($deleted == null ? 43 : $deleted.hashCode());
        final java.lang.Object $localId = this.getLocalId();
        result = result * PRIME + ($localId == null ? 43 : $localId.hashCode());
        final java.lang.Object $sendNickName = this.getSendNickName();
        result = result * PRIME + ($sendNickName == null ? 43 : $sendNickName.hashCode());
        final java.lang.Object $content = this.getContent();
        result = result * PRIME + ($content == null ? 43 : $content.hashCode());
        final java.lang.Object $atUserIds = this.getAtUserIds();
        result = result * PRIME + ($atUserIds == null ? 43 : $atUserIds.hashCode());
        final java.lang.Object $sendTime = this.getSendTime();
        result = result * PRIME + ($sendTime == null ? 43 : $sendTime.hashCode());
        return result;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "GroupMessageVO(id=" + this.getId() + ", localId=" + this.getLocalId() + ", seqNo=" + this.getSeqNo() + ", groupId=" + this.getGroupId() + ", sendId=" + this.getSendId() + ", sendNickName=" + this.getSendNickName() + ", content=" + this.getContent() + ", type=" + this.getType() + ", receipt=" + this.getReceipt() + ", receiptOk=" + this.getReceiptOk() + ", readedCount=" + this.getReadedCount() + ", atUserIds=" + this.getAtUserIds() + ", status=" + this.getStatus() + ", sendTime=" + this.getSendTime() + ", deleted=" + this.getDeleted() + ")";
    }
}
