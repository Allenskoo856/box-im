package com.bx.imcommon.model;

public class IMLoginInfo {
    /**
     * 登陆token
     */
    private String accessToken;
    /**
     * 设备id
     */
    private String devId;

    public IMLoginInfo() {
    }

    /**
     * 登陆token
     */
    public String getAccessToken() {
        return this.accessToken;
    }

    /**
     * 设备id
     */
    public String getDevId() {
        return this.devId;
    }

    /**
     * 登陆token
     */
    public void setAccessToken(final String accessToken) {
        this.accessToken = accessToken;
    }

    /**
     * 设备id
     */
    public void setDevId(final String devId) {
        this.devId = devId;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object o) {
        if (o == this) return true;
        if (!(o instanceof IMLoginInfo)) return false;
        final IMLoginInfo other = (IMLoginInfo) o;
        if (!other.canEqual((java.lang.Object) this)) return false;
        final java.lang.Object this$accessToken = this.getAccessToken();
        final java.lang.Object other$accessToken = other.getAccessToken();
        if (this$accessToken == null ? other$accessToken != null : !this$accessToken.equals(other$accessToken)) return false;
        final java.lang.Object this$devId = this.getDevId();
        final java.lang.Object other$devId = other.getDevId();
        if (this$devId == null ? other$devId != null : !this$devId.equals(other$devId)) return false;
        return true;
    }

    protected boolean canEqual(final java.lang.Object other) {
        return other instanceof IMLoginInfo;
    }

    @java.lang.Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final java.lang.Object $accessToken = this.getAccessToken();
        result = result * PRIME + ($accessToken == null ? 43 : $accessToken.hashCode());
        final java.lang.Object $devId = this.getDevId();
        result = result * PRIME + ($devId == null ? 43 : $devId.hashCode());
        return result;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "IMLoginInfo(accessToken=" + this.getAccessToken() + ", devId=" + this.getDevId() + ")";
    }
}
