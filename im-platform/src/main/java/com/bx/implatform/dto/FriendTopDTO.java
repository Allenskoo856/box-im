package com.bx.implatform.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotNull;

/**
 * @author Blue
 * @version 1.0
 */
@Schema(description = "好友会话置顶")
public class FriendTopDTO {
    @NotNull(message = "好友id不可为空")
    @Schema(description = "好友用户id")
    private Long friendId;
    @NotNull(message = "置顶状态不可为空")
    @Schema(description = "置顶状态")
    private Boolean isTop;

    public FriendTopDTO() {
    }

    public Long getFriendId() {
        return this.friendId;
    }

    public Boolean getIsTop() {
        return this.isTop;
    }

    public void setFriendId(final Long friendId) {
        this.friendId = friendId;
    }

    public void setIsTop(final Boolean isTop) {
        this.isTop = isTop;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object o) {
        if (o == this) return true;
        if (!(o instanceof FriendTopDTO)) return false;
        final FriendTopDTO other = (FriendTopDTO) o;
        if (!other.canEqual((java.lang.Object) this)) return false;
        final java.lang.Object this$friendId = this.getFriendId();
        final java.lang.Object other$friendId = other.getFriendId();
        if (this$friendId == null ? other$friendId != null : !this$friendId.equals(other$friendId)) return false;
        final java.lang.Object this$isTop = this.getIsTop();
        final java.lang.Object other$isTop = other.getIsTop();
        if (this$isTop == null ? other$isTop != null : !this$isTop.equals(other$isTop)) return false;
        return true;
    }

    protected boolean canEqual(final java.lang.Object other) {
        return other instanceof FriendTopDTO;
    }

    @java.lang.Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final java.lang.Object $friendId = this.getFriendId();
        result = result * PRIME + ($friendId == null ? 43 : $friendId.hashCode());
        final java.lang.Object $isTop = this.getIsTop();
        result = result * PRIME + ($isTop == null ? 43 : $isTop.hashCode());
        return result;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "FriendTopDTO(friendId=" + this.getFriendId() + ", isTop=" + this.getIsTop() + ")";
    }
}
