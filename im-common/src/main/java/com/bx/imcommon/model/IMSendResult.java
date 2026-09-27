package com.bx.imcommon.model;

public class IMSendResult<T> {
    /**
     * 发送方
     */
    private IMUserInfo sender;
    /**
     * 接收方
     */
    private IMUserInfo receiver;
    /**
     * 发送状态编码 IMSendCode
     */
    private Integer code;
    /**
     * 消息内容
     */
    private T data;

    public IMSendResult() {
    }

    /**
     * 发送方
     */
    public IMUserInfo getSender() {
        return this.sender;
    }

    /**
     * 接收方
     */
    public IMUserInfo getReceiver() {
        return this.receiver;
    }

    /**
     * 发送状态编码 IMSendCode
     */
    public Integer getCode() {
        return this.code;
    }

    /**
     * 消息内容
     */
    public T getData() {
        return this.data;
    }

    /**
     * 发送方
     */
    public void setSender(final IMUserInfo sender) {
        this.sender = sender;
    }

    /**
     * 接收方
     */
    public void setReceiver(final IMUserInfo receiver) {
        this.receiver = receiver;
    }

    /**
     * 发送状态编码 IMSendCode
     */
    public void setCode(final Integer code) {
        this.code = code;
    }

    /**
     * 消息内容
     */
    public void setData(final T data) {
        this.data = data;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object o) {
        if (o == this) return true;
        if (!(o instanceof IMSendResult)) return false;
        final IMSendResult<?> other = (IMSendResult<?>) o;
        if (!other.canEqual((java.lang.Object) this)) return false;
        final java.lang.Object this$code = this.getCode();
        final java.lang.Object other$code = other.getCode();
        if (this$code == null ? other$code != null : !this$code.equals(other$code)) return false;
        final java.lang.Object this$sender = this.getSender();
        final java.lang.Object other$sender = other.getSender();
        if (this$sender == null ? other$sender != null : !this$sender.equals(other$sender)) return false;
        final java.lang.Object this$receiver = this.getReceiver();
        final java.lang.Object other$receiver = other.getReceiver();
        if (this$receiver == null ? other$receiver != null : !this$receiver.equals(other$receiver)) return false;
        final java.lang.Object this$data = this.getData();
        final java.lang.Object other$data = other.getData();
        if (this$data == null ? other$data != null : !this$data.equals(other$data)) return false;
        return true;
    }

    protected boolean canEqual(final java.lang.Object other) {
        return other instanceof IMSendResult;
    }

    @java.lang.Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final java.lang.Object $code = this.getCode();
        result = result * PRIME + ($code == null ? 43 : $code.hashCode());
        final java.lang.Object $sender = this.getSender();
        result = result * PRIME + ($sender == null ? 43 : $sender.hashCode());
        final java.lang.Object $receiver = this.getReceiver();
        result = result * PRIME + ($receiver == null ? 43 : $receiver.hashCode());
        final java.lang.Object $data = this.getData();
        result = result * PRIME + ($data == null ? 43 : $data.hashCode());
        return result;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "IMSendResult(sender=" + this.getSender() + ", receiver=" + this.getReceiver() + ", code=" + this.getCode() + ", data=" + this.getData() + ")";
    }
}
