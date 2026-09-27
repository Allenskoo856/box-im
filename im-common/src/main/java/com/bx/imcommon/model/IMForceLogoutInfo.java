package com.bx.imcommon.model;

/**
 * @author Blue
 * @version 1.0
 */
public class IMForceLogoutInfo {
    /**
     * 用户id
     */
    private Long userId;
    /**
     * 用户终端类型 IMTerminalType
     */
    private Integer terminal;
    /**
     * 设备id
     */
    private String devId;
    /**
     * 下线类型，见 {@link com.bx.imcommon.enums.IMForceLogoutType}
     */
    private Integer type;
    /**
     * 原因说明（封禁时由管理端传入）
     */
    private String reason;

    public IMForceLogoutInfo() {
    }

    /**
     * 用户id
     */
    public Long getUserId() {
        return this.userId;
    }

    /**
     * 用户终端类型 IMTerminalType
     */
    public Integer getTerminal() {
        return this.terminal;
    }

    /**
     * 设备id
     */
    public String getDevId() {
        return this.devId;
    }

    /**
     * 下线类型，见 {@link com.bx.imcommon.enums.IMForceLogoutType}
     */
    public Integer getType() {
        return this.type;
    }

    /**
     * 原因说明（封禁时由管理端传入）
     */
    public String getReason() {
        return this.reason;
    }

    /**
     * 用户id
     */
    public void setUserId(final Long userId) {
        this.userId = userId;
    }

    /**
     * 用户终端类型 IMTerminalType
     */
    public void setTerminal(final Integer terminal) {
        this.terminal = terminal;
    }

    /**
     * 设备id
     */
    public void setDevId(final String devId) {
        this.devId = devId;
    }

    /**
     * 下线类型，见 {@link com.bx.imcommon.enums.IMForceLogoutType}
     */
    public void setType(final Integer type) {
        this.type = type;
    }

    /**
     * 原因说明（封禁时由管理端传入）
     */
    public void setReason(final String reason) {
        this.reason = reason;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object o) {
        if (o == this) return true;
        if (!(o instanceof IMForceLogoutInfo)) return false;
        final IMForceLogoutInfo other = (IMForceLogoutInfo) o;
        if (!other.canEqual((java.lang.Object) this)) return false;
        final java.lang.Object this$userId = this.getUserId();
        final java.lang.Object other$userId = other.getUserId();
        if (this$userId == null ? other$userId != null : !this$userId.equals(other$userId)) return false;
        final java.lang.Object this$terminal = this.getTerminal();
        final java.lang.Object other$terminal = other.getTerminal();
        if (this$terminal == null ? other$terminal != null : !this$terminal.equals(other$terminal)) return false;
        final java.lang.Object this$type = this.getType();
        final java.lang.Object other$type = other.getType();
        if (this$type == null ? other$type != null : !this$type.equals(other$type)) return false;
        final java.lang.Object this$devId = this.getDevId();
        final java.lang.Object other$devId = other.getDevId();
        if (this$devId == null ? other$devId != null : !this$devId.equals(other$devId)) return false;
        final java.lang.Object this$reason = this.getReason();
        final java.lang.Object other$reason = other.getReason();
        if (this$reason == null ? other$reason != null : !this$reason.equals(other$reason)) return false;
        return true;
    }

    protected boolean canEqual(final java.lang.Object other) {
        return other instanceof IMForceLogoutInfo;
    }

    @java.lang.Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final java.lang.Object $userId = this.getUserId();
        result = result * PRIME + ($userId == null ? 43 : $userId.hashCode());
        final java.lang.Object $terminal = this.getTerminal();
        result = result * PRIME + ($terminal == null ? 43 : $terminal.hashCode());
        final java.lang.Object $type = this.getType();
        result = result * PRIME + ($type == null ? 43 : $type.hashCode());
        final java.lang.Object $devId = this.getDevId();
        result = result * PRIME + ($devId == null ? 43 : $devId.hashCode());
        final java.lang.Object $reason = this.getReason();
        result = result * PRIME + ($reason == null ? 43 : $reason.hashCode());
        return result;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "IMForceLogoutInfo(userId=" + this.getUserId() + ", terminal=" + this.getTerminal() + ", devId=" + this.getDevId() + ", type=" + this.getType() + ", reason=" + this.getReason() + ")";
    }
}
