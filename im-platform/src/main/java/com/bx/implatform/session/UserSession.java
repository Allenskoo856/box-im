package com.bx.implatform.session;

import com.bx.imcommon.model.IMSessionInfo;

public class UserSession extends IMSessionInfo {
    /**
     * 用户名称
     */
    private String userName;
    /**
     * 用户昵称
     */
    private String nickName;

    @java.lang.Override
    public boolean equals(final java.lang.Object o) {
        if (o == this) return true;
        if (!(o instanceof UserSession)) return false;
        final UserSession other = (UserSession) o;
        if (!other.canEqual((java.lang.Object) this)) return false;
        if (!super.equals(o)) return false;
        final java.lang.Object this$userName = this.getUserName();
        final java.lang.Object other$userName = other.getUserName();
        if (this$userName == null ? other$userName != null : !this$userName.equals(other$userName)) return false;
        final java.lang.Object this$nickName = this.getNickName();
        final java.lang.Object other$nickName = other.getNickName();
        if (this$nickName == null ? other$nickName != null : !this$nickName.equals(other$nickName)) return false;
        return true;
    }

    protected boolean canEqual(final java.lang.Object other) {
        return other instanceof UserSession;
    }

    @java.lang.Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        final java.lang.Object $userName = this.getUserName();
        result = result * PRIME + ($userName == null ? 43 : $userName.hashCode());
        final java.lang.Object $nickName = this.getNickName();
        result = result * PRIME + ($nickName == null ? 43 : $nickName.hashCode());
        return result;
    }

    public UserSession() {
    }

    /**
     * 用户名称
     */
    public String getUserName() {
        return this.userName;
    }

    /**
     * 用户昵称
     */
    public String getNickName() {
        return this.nickName;
    }

    /**
     * 用户名称
     */
    public void setUserName(final String userName) {
        this.userName = userName;
    }

    /**
     * 用户昵称
     */
    public void setNickName(final String nickName) {
        this.nickName = nickName;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "UserSession(userName=" + this.getUserName() + ", nickName=" + this.getNickName() + ")";
    }
}
