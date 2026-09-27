package com.bx.implatform.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotNull;

/**
 * @author Blue
 * @version 1.0
 */
@Schema(description = "会话置顶状态设置")
public class GroupTopDTO {
    @NotNull(message = "群id不可为空")
    @Schema(description = "群组id")
    private Long groupId;
    @NotNull(message = "置顶状态不可为空")
    @Schema(description = "置顶状态")
    private Boolean isTop;

    public GroupTopDTO() {
    }

    public Long getGroupId() {
        return this.groupId;
    }

    public Boolean getIsTop() {
        return this.isTop;
    }

    public void setGroupId(final Long groupId) {
        this.groupId = groupId;
    }

    public void setIsTop(final Boolean isTop) {
        this.isTop = isTop;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object o) {
        if (o == this) return true;
        if (!(o instanceof GroupTopDTO)) return false;
        final GroupTopDTO other = (GroupTopDTO) o;
        if (!other.canEqual((java.lang.Object) this)) return false;
        final java.lang.Object this$groupId = this.getGroupId();
        final java.lang.Object other$groupId = other.getGroupId();
        if (this$groupId == null ? other$groupId != null : !this$groupId.equals(other$groupId)) return false;
        final java.lang.Object this$isTop = this.getIsTop();
        final java.lang.Object other$isTop = other.getIsTop();
        if (this$isTop == null ? other$isTop != null : !this$isTop.equals(other$isTop)) return false;
        return true;
    }

    protected boolean canEqual(final java.lang.Object other) {
        return other instanceof GroupTopDTO;
    }

    @java.lang.Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final java.lang.Object $groupId = this.getGroupId();
        result = result * PRIME + ($groupId == null ? 43 : $groupId.hashCode());
        final java.lang.Object $isTop = this.getIsTop();
        result = result * PRIME + ($isTop == null ? 43 : $isTop.hashCode());
        return result;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "GroupTopDTO(groupId=" + this.getGroupId() + ", isTop=" + this.getIsTop() + ")";
    }
}
