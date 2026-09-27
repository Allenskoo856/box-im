package com.bx.implatform.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import org.hibernate.validator.constraints.Length;
import java.util.List;

@Schema(description = "群聊消息DTO")
public class GroupMessageDTO {
    @NotEmpty(message = "本地消息id不可为空")
    @Schema(description = "本地消息id,前端通过雪花算法生成")
    private String localId;
    @NotNull(message = "群聊id不可为空")
    @Schema(description = "群聊id")
    private Long groupId;
    @Length(max = 1024, message = "发送内容长度不得大于1024")
    @NotEmpty(message = "发送内容不可为空")
    @Schema(description = "发送内容")
    private String content;
    @NotNull(message = "消息类型不可为空")
    @Schema(description = "消息类型 0:文字 1:图片 2:文件 3:语音 4:视频")
    private Integer type;
    @Schema(description = "是否回执消息")
    private Boolean receipt = false;
    @Size(max = 20, message = "一次最多只能@20个小伙伴哦")
    @Schema(description = "被@用户列表")
    private List<Long> atUserIds;

    public GroupMessageDTO() {
    }

    public String getLocalId() {
        return this.localId;
    }

    public Long getGroupId() {
        return this.groupId;
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

    public List<Long> getAtUserIds() {
        return this.atUserIds;
    }

    public void setLocalId(final String localId) {
        this.localId = localId;
    }

    public void setGroupId(final Long groupId) {
        this.groupId = groupId;
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

    public void setAtUserIds(final List<Long> atUserIds) {
        this.atUserIds = atUserIds;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object o) {
        if (o == this) return true;
        if (!(o instanceof GroupMessageDTO)) return false;
        final GroupMessageDTO other = (GroupMessageDTO) o;
        if (!other.canEqual((java.lang.Object) this)) return false;
        final java.lang.Object this$groupId = this.getGroupId();
        final java.lang.Object other$groupId = other.getGroupId();
        if (this$groupId == null ? other$groupId != null : !this$groupId.equals(other$groupId)) return false;
        final java.lang.Object this$type = this.getType();
        final java.lang.Object other$type = other.getType();
        if (this$type == null ? other$type != null : !this$type.equals(other$type)) return false;
        final java.lang.Object this$receipt = this.getReceipt();
        final java.lang.Object other$receipt = other.getReceipt();
        if (this$receipt == null ? other$receipt != null : !this$receipt.equals(other$receipt)) return false;
        final java.lang.Object this$localId = this.getLocalId();
        final java.lang.Object other$localId = other.getLocalId();
        if (this$localId == null ? other$localId != null : !this$localId.equals(other$localId)) return false;
        final java.lang.Object this$content = this.getContent();
        final java.lang.Object other$content = other.getContent();
        if (this$content == null ? other$content != null : !this$content.equals(other$content)) return false;
        final java.lang.Object this$atUserIds = this.getAtUserIds();
        final java.lang.Object other$atUserIds = other.getAtUserIds();
        if (this$atUserIds == null ? other$atUserIds != null : !this$atUserIds.equals(other$atUserIds)) return false;
        return true;
    }

    protected boolean canEqual(final java.lang.Object other) {
        return other instanceof GroupMessageDTO;
    }

    @java.lang.Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final java.lang.Object $groupId = this.getGroupId();
        result = result * PRIME + ($groupId == null ? 43 : $groupId.hashCode());
        final java.lang.Object $type = this.getType();
        result = result * PRIME + ($type == null ? 43 : $type.hashCode());
        final java.lang.Object $receipt = this.getReceipt();
        result = result * PRIME + ($receipt == null ? 43 : $receipt.hashCode());
        final java.lang.Object $localId = this.getLocalId();
        result = result * PRIME + ($localId == null ? 43 : $localId.hashCode());
        final java.lang.Object $content = this.getContent();
        result = result * PRIME + ($content == null ? 43 : $content.hashCode());
        final java.lang.Object $atUserIds = this.getAtUserIds();
        result = result * PRIME + ($atUserIds == null ? 43 : $atUserIds.hashCode());
        return result;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "GroupMessageDTO(localId=" + this.getLocalId() + ", groupId=" + this.getGroupId() + ", content=" + this.getContent() + ", type=" + this.getType() + ", receipt=" + this.getReceipt() + ", atUserIds=" + this.getAtUserIds() + ")";
    }
}
