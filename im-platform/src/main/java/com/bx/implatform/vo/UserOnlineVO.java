package com.bx.implatform.vo;

import io.swagger.v3.oas.annotations.media.Schema;

/**
 * 用户在线状态
 * @author Blue
 * @version 1.0
 */
@Schema(description = "用户在线状态VO")
public class UserOnlineVO {
    @Schema(description = "用户id")
    private Long userId;
    @Schema(description = "终端类型")
    private Integer terminal;
    @Schema(description = "是否在线")
    private Boolean online;

    public UserOnlineVO() {
    }

    public Long getUserId() {
        return this.userId;
    }

    public Integer getTerminal() {
        return this.terminal;
    }

    public Boolean getOnline() {
        return this.online;
    }

    public void setUserId(final Long userId) {
        this.userId = userId;
    }

    public void setTerminal(final Integer terminal) {
        this.terminal = terminal;
    }

    public void setOnline(final Boolean online) {
        this.online = online;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object o) {
        if (o == this) return true;
        if (!(o instanceof UserOnlineVO)) return false;
        final UserOnlineVO other = (UserOnlineVO) o;
        if (!other.canEqual((java.lang.Object) this)) return false;
        final java.lang.Object this$userId = this.getUserId();
        final java.lang.Object other$userId = other.getUserId();
        if (this$userId == null ? other$userId != null : !this$userId.equals(other$userId)) return false;
        final java.lang.Object this$terminal = this.getTerminal();
        final java.lang.Object other$terminal = other.getTerminal();
        if (this$terminal == null ? other$terminal != null : !this$terminal.equals(other$terminal)) return false;
        final java.lang.Object this$online = this.getOnline();
        final java.lang.Object other$online = other.getOnline();
        if (this$online == null ? other$online != null : !this$online.equals(other$online)) return false;
        return true;
    }

    protected boolean canEqual(final java.lang.Object other) {
        return other instanceof UserOnlineVO;
    }

    @java.lang.Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final java.lang.Object $userId = this.getUserId();
        result = result * PRIME + ($userId == null ? 43 : $userId.hashCode());
        final java.lang.Object $terminal = this.getTerminal();
        result = result * PRIME + ($terminal == null ? 43 : $terminal.hashCode());
        final java.lang.Object $online = this.getOnline();
        result = result * PRIME + ($online == null ? 43 : $online.hashCode());
        return result;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "UserOnlineVO(userId=" + this.getUserId() + ", terminal=" + this.getTerminal() + ", online=" + this.getOnline() + ")";
    }
}
