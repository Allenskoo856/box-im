package com.bx.implatform.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import java.util.List;

@Schema(description = "选择好友创建群聊请求")
public class GroupNewDTO {
    @Size(min = 1, max = 50, message = "一次最多选择50位好友")
    @NotEmpty(message = "请选择好友")
    @Schema(description = "好友用户id列表")
    private List<Long> userIds;

    public GroupNewDTO() {
    }

    public List<Long> getUserIds() {
        return this.userIds;
    }

    public void setUserIds(final List<Long> userIds) {
        this.userIds = userIds;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object o) {
        if (o == this) return true;
        if (!(o instanceof GroupNewDTO)) return false;
        final GroupNewDTO other = (GroupNewDTO) o;
        if (!other.canEqual((java.lang.Object) this)) return false;
        final java.lang.Object this$userIds = this.getUserIds();
        final java.lang.Object other$userIds = other.getUserIds();
        if (this$userIds == null ? other$userIds != null : !this$userIds.equals(other$userIds)) return false;
        return true;
    }

    protected boolean canEqual(final java.lang.Object other) {
        return other instanceof GroupNewDTO;
    }

    @java.lang.Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final java.lang.Object $userIds = this.getUserIds();
        result = result * PRIME + ($userIds == null ? 43 : $userIds.hashCode());
        return result;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "GroupNewDTO(userIds=" + this.getUserIds() + ")";
    }
}
