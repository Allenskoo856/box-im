package com.bx.implatform.session;
/*
 * webrtc 会话信息
 * @Author Blue
 * @Date 2022/10/21
 */
public class WebrtcPrivateSession {
    /**
     * 发起者id
     */
    private Long callerId;
    /**
     * 发起者终端类型
     */
    private Integer callerTerminal;
    /**
     * 接受者id
     */
    private Long acceptorId;
    /**
     * 接受者终端类型
     */
    private Integer acceptorTerminal;
    /**
     * 通话模式
     */
    private String mode;
    /**
     * 开始聊天时间戳
     */
    private Long chatTimeStamp;

    public WebrtcPrivateSession() {
    }

    /**
     * 发起者id
     */
    public Long getCallerId() {
        return this.callerId;
    }

    /**
     * 发起者终端类型
     */
    public Integer getCallerTerminal() {
        return this.callerTerminal;
    }

    /**
     * 接受者id
     */
    public Long getAcceptorId() {
        return this.acceptorId;
    }

    /**
     * 接受者终端类型
     */
    public Integer getAcceptorTerminal() {
        return this.acceptorTerminal;
    }

    /**
     * 通话模式
     */
    public String getMode() {
        return this.mode;
    }

    /**
     * 开始聊天时间戳
     */
    public Long getChatTimeStamp() {
        return this.chatTimeStamp;
    }

    /**
     * 发起者id
     */
    public void setCallerId(final Long callerId) {
        this.callerId = callerId;
    }

    /**
     * 发起者终端类型
     */
    public void setCallerTerminal(final Integer callerTerminal) {
        this.callerTerminal = callerTerminal;
    }

    /**
     * 接受者id
     */
    public void setAcceptorId(final Long acceptorId) {
        this.acceptorId = acceptorId;
    }

    /**
     * 接受者终端类型
     */
    public void setAcceptorTerminal(final Integer acceptorTerminal) {
        this.acceptorTerminal = acceptorTerminal;
    }

    /**
     * 通话模式
     */
    public void setMode(final String mode) {
        this.mode = mode;
    }

    /**
     * 开始聊天时间戳
     */
    public void setChatTimeStamp(final Long chatTimeStamp) {
        this.chatTimeStamp = chatTimeStamp;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object o) {
        if (o == this) return true;
        if (!(o instanceof WebrtcPrivateSession)) return false;
        final WebrtcPrivateSession other = (WebrtcPrivateSession) o;
        if (!other.canEqual((java.lang.Object) this)) return false;
        final java.lang.Object this$callerId = this.getCallerId();
        final java.lang.Object other$callerId = other.getCallerId();
        if (this$callerId == null ? other$callerId != null : !this$callerId.equals(other$callerId)) return false;
        final java.lang.Object this$callerTerminal = this.getCallerTerminal();
        final java.lang.Object other$callerTerminal = other.getCallerTerminal();
        if (this$callerTerminal == null ? other$callerTerminal != null : !this$callerTerminal.equals(other$callerTerminal)) return false;
        final java.lang.Object this$acceptorId = this.getAcceptorId();
        final java.lang.Object other$acceptorId = other.getAcceptorId();
        if (this$acceptorId == null ? other$acceptorId != null : !this$acceptorId.equals(other$acceptorId)) return false;
        final java.lang.Object this$acceptorTerminal = this.getAcceptorTerminal();
        final java.lang.Object other$acceptorTerminal = other.getAcceptorTerminal();
        if (this$acceptorTerminal == null ? other$acceptorTerminal != null : !this$acceptorTerminal.equals(other$acceptorTerminal)) return false;
        final java.lang.Object this$chatTimeStamp = this.getChatTimeStamp();
        final java.lang.Object other$chatTimeStamp = other.getChatTimeStamp();
        if (this$chatTimeStamp == null ? other$chatTimeStamp != null : !this$chatTimeStamp.equals(other$chatTimeStamp)) return false;
        final java.lang.Object this$mode = this.getMode();
        final java.lang.Object other$mode = other.getMode();
        if (this$mode == null ? other$mode != null : !this$mode.equals(other$mode)) return false;
        return true;
    }

    protected boolean canEqual(final java.lang.Object other) {
        return other instanceof WebrtcPrivateSession;
    }

    @java.lang.Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final java.lang.Object $callerId = this.getCallerId();
        result = result * PRIME + ($callerId == null ? 43 : $callerId.hashCode());
        final java.lang.Object $callerTerminal = this.getCallerTerminal();
        result = result * PRIME + ($callerTerminal == null ? 43 : $callerTerminal.hashCode());
        final java.lang.Object $acceptorId = this.getAcceptorId();
        result = result * PRIME + ($acceptorId == null ? 43 : $acceptorId.hashCode());
        final java.lang.Object $acceptorTerminal = this.getAcceptorTerminal();
        result = result * PRIME + ($acceptorTerminal == null ? 43 : $acceptorTerminal.hashCode());
        final java.lang.Object $chatTimeStamp = this.getChatTimeStamp();
        result = result * PRIME + ($chatTimeStamp == null ? 43 : $chatTimeStamp.hashCode());
        final java.lang.Object $mode = this.getMode();
        result = result * PRIME + ($mode == null ? 43 : $mode.hashCode());
        return result;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "WebrtcPrivateSession(callerId=" + this.getCallerId() + ", callerTerminal=" + this.getCallerTerminal() + ", acceptorId=" + this.getAcceptorId() + ", acceptorTerminal=" + this.getAcceptorTerminal() + ", mode=" + this.getMode() + ", chatTimeStamp=" + this.getChatTimeStamp() + ")";
    }
}
