package com.bx.imcommon.model;

/**
 * 强制下线推送给客户端的数据
 */
public class IMForceLogoutData {
    /**
     * 下线类型，见 {@link com.bx.imcommon.enums.IMForceLogoutType}
     */
    private Integer type;
    /**
     * 原因说明（封禁时由管理端传入）
     */
    private String reason;

    public IMForceLogoutData() {
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
        if (!(o instanceof IMForceLogoutData)) return false;
        final IMForceLogoutData other = (IMForceLogoutData) o;
        if (!other.canEqual((java.lang.Object) this)) return false;
        final java.lang.Object this$type = this.getType();
        final java.lang.Object other$type = other.getType();
        if (this$type == null ? other$type != null : !this$type.equals(other$type)) return false;
        final java.lang.Object this$reason = this.getReason();
        final java.lang.Object other$reason = other.getReason();
        if (this$reason == null ? other$reason != null : !this$reason.equals(other$reason)) return false;
        return true;
    }

    protected boolean canEqual(final java.lang.Object other) {
        return other instanceof IMForceLogoutData;
    }

    @java.lang.Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final java.lang.Object $type = this.getType();
        result = result * PRIME + ($type == null ? 43 : $type.hashCode());
        final java.lang.Object $reason = this.getReason();
        result = result * PRIME + ($reason == null ? 43 : $reason.hashCode());
        return result;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "IMForceLogoutData(type=" + this.getType() + ", reason=" + this.getReason() + ")";
    }
}
