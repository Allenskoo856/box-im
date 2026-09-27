package com.bx.imcommon.model;

public class IMSessionInfo {
    /**
     * 用户id
     */
    private Long userId;
    /**
     * 终端类型
     */
    private Integer terminal;

    public IMSessionInfo() {
    }

    /**
     * 用户id
     */
    public Long getUserId() {
        return this.userId;
    }

    /**
     * 终端类型
     */
    public Integer getTerminal() {
        return this.terminal;
    }

    /**
     * 用户id
     */
    public void setUserId(final Long userId) {
        this.userId = userId;
    }

    /**
     * 终端类型
     */
    public void setTerminal(final Integer terminal) {
        this.terminal = terminal;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object o) {
        if (o == this) return true;
        if (!(o instanceof IMSessionInfo)) return false;
        final IMSessionInfo other = (IMSessionInfo) o;
        if (!other.canEqual((java.lang.Object) this)) return false;
        final java.lang.Object this$userId = this.getUserId();
        final java.lang.Object other$userId = other.getUserId();
        if (this$userId == null ? other$userId != null : !this$userId.equals(other$userId)) return false;
        final java.lang.Object this$terminal = this.getTerminal();
        final java.lang.Object other$terminal = other.getTerminal();
        if (this$terminal == null ? other$terminal != null : !this$terminal.equals(other$terminal)) return false;
        return true;
    }

    protected boolean canEqual(final java.lang.Object other) {
        return other instanceof IMSessionInfo;
    }

    @java.lang.Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final java.lang.Object $userId = this.getUserId();
        result = result * PRIME + ($userId == null ? 43 : $userId.hashCode());
        final java.lang.Object $terminal = this.getTerminal();
        result = result * PRIME + ($terminal == null ? 43 : $terminal.hashCode());
        return result;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "IMSessionInfo(userId=" + this.getUserId() + ", terminal=" + this.getTerminal() + ")";
    }
}
