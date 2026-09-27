package com.bx.implatform.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import java.util.List;

/**
 * @author Blue
 * @version 1.0
 * @date 2025-02-23
 */
@Schema(description = "移除群聊成员")
public class GroupMemberRemoveDTO {
    @NotNull(message = "群id不可为空")
    @Schema(description = "群组id")
    private Long groupId;
    @Size(max = 50, message = "一次最多只能选择50位用户")
    @NotEmpty(message = "成员用户id不可为空")
    @Schema(description = "成员用户id")
    private List<Long> userIds;

    public GroupMemberRemoveDTO() {
    }

    public Long getGroupId() {
        return this.groupId;
    }

    public List<Long> getUserIds() {
        return this.userIds;
    }

    public void setGroupId(final Long groupId) {
        this.groupId = groupId;
    }

    public void setUserIds(final List<Long> userIds) {
        this.userIds = userIds;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object o) {
        if (o == this) return true;
        if (!(o instanceof GroupMemberRemoveDTO)) return false;
        final GroupMemberRemoveDTO other = (GroupMemberRemoveDTO) o;
        if (!other.canEqual((java.lang.Object) this)) return false;
        final java.lang.Object this$groupId = this.getGroupId();
        final java.lang.Object other$groupId = other.getGroupId();
        if (this$groupId == null ? other$groupId != null : !this$groupId.equals(other$groupId)) return false;
        final java.lang.Object this$userIds = this.getUserIds();
        final java.lang.Object other$userIds = other.getUserIds();
        if (this$userIds == null ? other$userIds != null : !this$userIds.equals(other$userIds)) return false;
        return true;
    }

    protected boolean canEqual(final java.lang.Object other) {
        return other instanceof GroupMemberRemoveDTO;
    }

    @java.lang.Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final java.lang.Object $groupId = this.getGroupId();
        result = result * PRIME + ($groupId == null ? 43 : $groupId.hashCode());
        final java.lang.Object $userIds = this.getUserIds();
        result = result * PRIME + ($userIds == null ? 43 : $userIds.hashCode());
        return result;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "GroupMemberRemoveDTO(groupId=" + this.getGroupId() + ", userIds=" + this.getUserIds() + ")";
    }
}
