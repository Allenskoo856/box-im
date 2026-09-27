package com.bx.implatform.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotNull;

/**
 * @author Blue
 * @version 1.0
 * @date 2025-02-23
 */
@Schema(description = "群聊免打扰")
public class GroupDndDTO {
    @NotNull(message = "群id不可为空")
    @Schema(description = "群组id")
    private Long groupId;
    @NotNull(message = "免打扰状态不可为空")
    @Schema(description = "免打扰状态")
    private Boolean isDnd;

    public GroupDndDTO() {
    }

    public Long getGroupId() {
        return this.groupId;
    }

    public Boolean getIsDnd() {
        return this.isDnd;
    }

    public void setGroupId(final Long groupId) {
        this.groupId = groupId;
    }

    public void setIsDnd(final Boolean isDnd) {
        this.isDnd = isDnd;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object o) {
        if (o == this) return true;
        if (!(o instanceof GroupDndDTO)) return false;
        final GroupDndDTO other = (GroupDndDTO) o;
        if (!other.canEqual((java.lang.Object) this)) return false;
        final java.lang.Object this$groupId = this.getGroupId();
        final java.lang.Object other$groupId = other.getGroupId();
        if (this$groupId == null ? other$groupId != null : !this$groupId.equals(other$groupId)) return false;
        final java.lang.Object this$isDnd = this.getIsDnd();
        final java.lang.Object other$isDnd = other.getIsDnd();
        if (this$isDnd == null ? other$isDnd != null : !this$isDnd.equals(other$isDnd)) return false;
        return true;
    }

    protected boolean canEqual(final java.lang.Object other) {
        return other instanceof GroupDndDTO;
    }

    @java.lang.Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final java.lang.Object $groupId = this.getGroupId();
        result = result * PRIME + ($groupId == null ? 43 : $groupId.hashCode());
        final java.lang.Object $isDnd = this.getIsDnd();
        result = result * PRIME + ($isDnd == null ? 43 : $isDnd.hashCode());
        return result;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "GroupDndDTO(groupId=" + this.getGroupId() + ", isDnd=" + this.getIsDnd() + ")";
    }
}
