package com.bx.implatform.session;

import com.bx.imcommon.model.IMUserInfo;
import java.util.LinkedList;
import java.util.List;

/**
 * @author: Blue
 * @date: 2024-06-01
 * @version: 1.0
 */
public class WebrtcGroupSession {
    /**
     * 通话发起者
     */
    private IMUserInfo host;
    /**
     * 所有被邀请的用户列表
     */
    private List<WebrtcUserInfo> userInfos;
    /**
     * 已经进入通话的用户列表
     */
    private List<IMUserInfo> inChatUsers = new LinkedList<>();

    public WebrtcGroupSession() {
    }

    /**
     * 通话发起者
     */
    public IMUserInfo getHost() {
        return this.host;
    }

    /**
     * 所有被邀请的用户列表
     */
    public List<WebrtcUserInfo> getUserInfos() {
        return this.userInfos;
    }

    /**
     * 已经进入通话的用户列表
     */
    public List<IMUserInfo> getInChatUsers() {
        return this.inChatUsers;
    }

    /**
     * 通话发起者
     */
    public void setHost(final IMUserInfo host) {
        this.host = host;
    }

    /**
     * 所有被邀请的用户列表
     */
    public void setUserInfos(final List<WebrtcUserInfo> userInfos) {
        this.userInfos = userInfos;
    }

    /**
     * 已经进入通话的用户列表
     */
    public void setInChatUsers(final List<IMUserInfo> inChatUsers) {
        this.inChatUsers = inChatUsers;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object o) {
        if (o == this) return true;
        if (!(o instanceof WebrtcGroupSession)) return false;
        final WebrtcGroupSession other = (WebrtcGroupSession) o;
        if (!other.canEqual((java.lang.Object) this)) return false;
        final java.lang.Object this$host = this.getHost();
        final java.lang.Object other$host = other.getHost();
        if (this$host == null ? other$host != null : !this$host.equals(other$host)) return false;
        final java.lang.Object this$userInfos = this.getUserInfos();
        final java.lang.Object other$userInfos = other.getUserInfos();
        if (this$userInfos == null ? other$userInfos != null : !this$userInfos.equals(other$userInfos)) return false;
        final java.lang.Object this$inChatUsers = this.getInChatUsers();
        final java.lang.Object other$inChatUsers = other.getInChatUsers();
        if (this$inChatUsers == null ? other$inChatUsers != null : !this$inChatUsers.equals(other$inChatUsers)) return false;
        return true;
    }

    protected boolean canEqual(final java.lang.Object other) {
        return other instanceof WebrtcGroupSession;
    }

    @java.lang.Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final java.lang.Object $host = this.getHost();
        result = result * PRIME + ($host == null ? 43 : $host.hashCode());
        final java.lang.Object $userInfos = this.getUserInfos();
        result = result * PRIME + ($userInfos == null ? 43 : $userInfos.hashCode());
        final java.lang.Object $inChatUsers = this.getInChatUsers();
        result = result * PRIME + ($inChatUsers == null ? 43 : $inChatUsers.hashCode());
        return result;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "WebrtcGroupSession(host=" + this.getHost() + ", userInfos=" + this.getUserInfos() + ", inChatUsers=" + this.getInChatUsers() + ")";
    }
}
