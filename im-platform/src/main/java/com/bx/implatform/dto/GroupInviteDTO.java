package com.bx.implatform.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import java.util.List;

@Schema(description = "邀请好友进群请求DTO")
public class GroupInviteDTO {
    @NotNull(message = "群id不可为空")
    @Schema(description = "群id")
    private Long groupId;
    @Size(max = 50, message = "一次最多只能邀请50位用户")
    @NotEmpty(message = "群id不可为空")
    @Schema(description = "好友id列表不可为空")
    private List<Long> friendIds;

    public GroupInviteDTO() {
    }

    public Long getGroupId() {
        return this.groupId;
    }

    public List<Long> getFriendIds() {
        return this.friendIds;
    }

    public void setGroupId(final Long groupId) {
        this.groupId = groupId;
    }

    public void setFriendIds(final List<Long> friendIds) {
        this.friendIds = friendIds;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object o) {
        if (o == this) return true;
        if (!(o instanceof GroupInviteDTO)) return false;
        final GroupInviteDTO other = (GroupInviteDTO) o;
        if (!other.canEqual((java.lang.Object) this)) return false;
        final java.lang.Object this$groupId = this.getGroupId();
        final java.lang.Object other$groupId = other.getGroupId();
        if (this$groupId == null ? other$groupId != null : !this$groupId.equals(other$groupId)) return false;
        final java.lang.Object this$friendIds = this.getFriendIds();
        final java.lang.Object other$friendIds = other.getFriendIds();
        if (this$friendIds == null ? other$friendIds != null : !this$friendIds.equals(other$friendIds)) return false;
        return true;
    }

    protected boolean canEqual(final java.lang.Object other) {
        return other instanceof GroupInviteDTO;
    }

    @java.lang.Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final java.lang.Object $groupId = this.getGroupId();
        result = result * PRIME + ($groupId == null ? 43 : $groupId.hashCode());
        final java.lang.Object $friendIds = this.getFriendIds();
        result = result * PRIME + ($friendIds == null ? 43 : $friendIds.hashCode());
        return result;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "GroupInviteDTO(groupId=" + this.getGroupId() + ", friendIds=" + this.getFriendIds() + ")";
    }
}
