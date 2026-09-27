package com.bx.implatform.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotNull;

/**
 * @author Blue
 * @version 1.0
 */
@Schema(description = "好友免打扰")
public class FriendDndDTO {
    @NotNull(message = "好友id不可为空")
    @Schema(description = "好友用户id")
    private Long friendId;
    @NotNull(message = "消息免打扰状态不可为空")
    @Schema(description = "消息免打扰状态")
    private Boolean isDnd;

    public FriendDndDTO() {
    }

    public Long getFriendId() {
        return this.friendId;
    }

    public Boolean getIsDnd() {
        return this.isDnd;
    }

    public void setFriendId(final Long friendId) {
        this.friendId = friendId;
    }

    public void setIsDnd(final Boolean isDnd) {
        this.isDnd = isDnd;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object o) {
        if (o == this) return true;
        if (!(o instanceof FriendDndDTO)) return false;
        final FriendDndDTO other = (FriendDndDTO) o;
        if (!other.canEqual((java.lang.Object) this)) return false;
        final java.lang.Object this$friendId = this.getFriendId();
        final java.lang.Object other$friendId = other.getFriendId();
        if (this$friendId == null ? other$friendId != null : !this$friendId.equals(other$friendId)) return false;
        final java.lang.Object this$isDnd = this.getIsDnd();
        final java.lang.Object other$isDnd = other.getIsDnd();
        if (this$isDnd == null ? other$isDnd != null : !this$isDnd.equals(other$isDnd)) return false;
        return true;
    }

    protected boolean canEqual(final java.lang.Object other) {
        return other instanceof FriendDndDTO;
    }

    @java.lang.Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final java.lang.Object $friendId = this.getFriendId();
        result = result * PRIME + ($friendId == null ? 43 : $friendId.hashCode());
        final java.lang.Object $isDnd = this.getIsDnd();
        result = result * PRIME + ($isDnd == null ? 43 : $isDnd.hashCode());
        return result;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "FriendDndDTO(friendId=" + this.getFriendId() + ", isDnd=" + this.getIsDnd() + ")";
    }
}
