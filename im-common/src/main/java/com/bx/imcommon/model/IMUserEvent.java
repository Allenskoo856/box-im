package com.bx.imcommon.model;

/**
 * 用户事件
 *
 * @author Blue
 * @version 1.0
 */
public class IMUserEvent {
    /**
     * 事件类型
     */
    private Integer eventType;
    /**
     * 用户信息
     */
    IMUserInfo userInfo;

    public IMUserEvent() {
    }

    /**
     * 事件类型
     */
    public Integer getEventType() {
        return this.eventType;
    }

    /**
     * 用户信息
     */
    public IMUserInfo getUserInfo() {
        return this.userInfo;
    }

    /**
     * 事件类型
     */
    public void setEventType(final Integer eventType) {
        this.eventType = eventType;
    }

    /**
     * 用户信息
     */
    public void setUserInfo(final IMUserInfo userInfo) {
        this.userInfo = userInfo;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object o) {
        if (o == this) return true;
        if (!(o instanceof IMUserEvent)) return false;
        final IMUserEvent other = (IMUserEvent) o;
        if (!other.canEqual((java.lang.Object) this)) return false;
        final java.lang.Object this$eventType = this.getEventType();
        final java.lang.Object other$eventType = other.getEventType();
        if (this$eventType == null ? other$eventType != null : !this$eventType.equals(other$eventType)) return false;
        final java.lang.Object this$userInfo = this.getUserInfo();
        final java.lang.Object other$userInfo = other.getUserInfo();
        if (this$userInfo == null ? other$userInfo != null : !this$userInfo.equals(other$userInfo)) return false;
        return true;
    }

    protected boolean canEqual(final java.lang.Object other) {
        return other instanceof IMUserEvent;
    }

    @java.lang.Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final java.lang.Object $eventType = this.getEventType();
        result = result * PRIME + ($eventType == null ? 43 : $eventType.hashCode());
        final java.lang.Object $userInfo = this.getUserInfo();
        result = result * PRIME + ($userInfo == null ? 43 : $userInfo.hashCode());
        return result;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "IMUserEvent(eventType=" + this.getEventType() + ", userInfo=" + this.getUserInfo() + ")";
    }
}
