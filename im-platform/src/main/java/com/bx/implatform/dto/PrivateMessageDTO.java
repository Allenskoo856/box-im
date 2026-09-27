package com.bx.implatform.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import org.hibernate.validator.constraints.Length;

@Schema(description = "私聊消息DTO")
public class PrivateMessageDTO {
    @NotEmpty(message = "本地消息id不可为空")
    @Schema(description = "本地消息id,前端通过雪花算法生成")
    private String localId;
    @NotNull(message = "接收用户id不可为空")
    @Schema(description = "接收用户id")
    private Long recvId;
    @Length(max = 1024, message = "内容长度不得大于1024")
    @NotEmpty(message = "发送内容不可为空")
    @Schema(description = "发送内容")
    private String content;
    @NotNull(message = "消息类型不可为空")
    @Schema(description = "消息类型 0:文字 1:图片 2:文件 3:语音 4:视频")
    private Integer type;

    public PrivateMessageDTO() {
    }

    public String getLocalId() {
        return this.localId;
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

    public void setLocalId(final String localId) {
        this.localId = localId;
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

    @java.lang.Override
    public boolean equals(final java.lang.Object o) {
        if (o == this) return true;
        if (!(o instanceof PrivateMessageDTO)) return false;
        final PrivateMessageDTO other = (PrivateMessageDTO) o;
        if (!other.canEqual((java.lang.Object) this)) return false;
        final java.lang.Object this$recvId = this.getRecvId();
        final java.lang.Object other$recvId = other.getRecvId();
        if (this$recvId == null ? other$recvId != null : !this$recvId.equals(other$recvId)) return false;
        final java.lang.Object this$type = this.getType();
        final java.lang.Object other$type = other.getType();
        if (this$type == null ? other$type != null : !this$type.equals(other$type)) return false;
        final java.lang.Object this$localId = this.getLocalId();
        final java.lang.Object other$localId = other.getLocalId();
        if (this$localId == null ? other$localId != null : !this$localId.equals(other$localId)) return false;
        final java.lang.Object this$content = this.getContent();
        final java.lang.Object other$content = other.getContent();
        if (this$content == null ? other$content != null : !this$content.equals(other$content)) return false;
        return true;
    }

    protected boolean canEqual(final java.lang.Object other) {
        return other instanceof PrivateMessageDTO;
    }

    @java.lang.Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final java.lang.Object $recvId = this.getRecvId();
        result = result * PRIME + ($recvId == null ? 43 : $recvId.hashCode());
        final java.lang.Object $type = this.getType();
        result = result * PRIME + ($type == null ? 43 : $type.hashCode());
        final java.lang.Object $localId = this.getLocalId();
        result = result * PRIME + ($localId == null ? 43 : $localId.hashCode());
        final java.lang.Object $content = this.getContent();
        result = result * PRIME + ($content == null ? 43 : $content.hashCode());
        return result;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "PrivateMessageDTO(localId=" + this.getLocalId() + ", recvId=" + this.getRecvId() + ", content=" + this.getContent() + ", type=" + this.getType() + ")";
    }
}
