package com.bx.implatform.vo;

import com.bx.imcommon.serializer.DateToLongSerializer;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.Date;

@Schema(description = "系统消息VO")
public class SystemMessageVO {
    @Schema(description = " 消息id")
    private Long id;
    @Schema(description = " 发送内容")
    private String content;
    @Schema(description = "消息内容类型 MessageType")
    private Integer type;
    @Schema(description = " 发送时间")
    @JsonSerialize(using = DateToLongSerializer.class)
    private Date sendTime;

    public SystemMessageVO() {
    }

    public Long getId() {
        return this.id;
    }

    public String getContent() {
        return this.content;
    }

    public Integer getType() {
        return this.type;
    }

    public Date getSendTime() {
        return this.sendTime;
    }

    public void setId(final Long id) {
        this.id = id;
    }

    public void setContent(final String content) {
        this.content = content;
    }

    public void setType(final Integer type) {
        this.type = type;
    }

    public void setSendTime(final Date sendTime) {
        this.sendTime = sendTime;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object o) {
        if (o == this) return true;
        if (!(o instanceof SystemMessageVO)) return false;
        final SystemMessageVO other = (SystemMessageVO) o;
        if (!other.canEqual((java.lang.Object) this)) return false;
        final java.lang.Object this$id = this.getId();
        final java.lang.Object other$id = other.getId();
        if (this$id == null ? other$id != null : !this$id.equals(other$id)) return false;
        final java.lang.Object this$type = this.getType();
        final java.lang.Object other$type = other.getType();
        if (this$type == null ? other$type != null : !this$type.equals(other$type)) return false;
        final java.lang.Object this$content = this.getContent();
        final java.lang.Object other$content = other.getContent();
        if (this$content == null ? other$content != null : !this$content.equals(other$content)) return false;
        final java.lang.Object this$sendTime = this.getSendTime();
        final java.lang.Object other$sendTime = other.getSendTime();
        if (this$sendTime == null ? other$sendTime != null : !this$sendTime.equals(other$sendTime)) return false;
        return true;
    }

    protected boolean canEqual(final java.lang.Object other) {
        return other instanceof SystemMessageVO;
    }

    @java.lang.Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final java.lang.Object $id = this.getId();
        result = result * PRIME + ($id == null ? 43 : $id.hashCode());
        final java.lang.Object $type = this.getType();
        result = result * PRIME + ($type == null ? 43 : $type.hashCode());
        final java.lang.Object $content = this.getContent();
        result = result * PRIME + ($content == null ? 43 : $content.hashCode());
        final java.lang.Object $sendTime = this.getSendTime();
        result = result * PRIME + ($sendTime == null ? 43 : $sendTime.hashCode());
        return result;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "SystemMessageVO(id=" + this.getId() + ", content=" + this.getContent() + ", type=" + this.getType() + ", sendTime=" + this.getSendTime() + ")";
    }
}
