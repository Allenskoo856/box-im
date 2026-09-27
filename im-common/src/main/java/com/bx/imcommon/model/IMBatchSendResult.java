package com.bx.imcommon.model;

import java.util.List;

public class IMBatchSendResult<T> {
    /**
     * 发送方
     */
    private IMUserInfo sender;
    /**
     * 接收方
     */
    private List<IMUserInfo> receivers;
    /**
     * 发送状态编码 IMSendCode
     */
    private Integer code;
    /**
     * 消息内容
     */
    private T data;

    public IMBatchSendResult() {
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
    public List<IMUserInfo> getReceivers() {
        return this.receivers;
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
    public void setReceivers(final List<IMUserInfo> receivers) {
        this.receivers = receivers;
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
        if (!(o instanceof IMBatchSendResult)) return false;
        final IMBatchSendResult<?> other = (IMBatchSendResult<?>) o;
        if (!other.canEqual((java.lang.Object) this)) return false;
        final java.lang.Object this$code = this.getCode();
        final java.lang.Object other$code = other.getCode();
        if (this$code == null ? other$code != null : !this$code.equals(other$code)) return false;
        final java.lang.Object this$sender = this.getSender();
        final java.lang.Object other$sender = other.getSender();
        if (this$sender == null ? other$sender != null : !this$sender.equals(other$sender)) return false;
        final java.lang.Object this$receivers = this.getReceivers();
        final java.lang.Object other$receivers = other.getReceivers();
        if (this$receivers == null ? other$receivers != null : !this$receivers.equals(other$receivers)) return false;
        final java.lang.Object this$data = this.getData();
        final java.lang.Object other$data = other.getData();
        if (this$data == null ? other$data != null : !this$data.equals(other$data)) return false;
        return true;
    }

    protected boolean canEqual(final java.lang.Object other) {
        return other instanceof IMBatchSendResult;
    }

    @java.lang.Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final java.lang.Object $code = this.getCode();
        result = result * PRIME + ($code == null ? 43 : $code.hashCode());
        final java.lang.Object $sender = this.getSender();
        result = result * PRIME + ($sender == null ? 43 : $sender.hashCode());
        final java.lang.Object $receivers = this.getReceivers();
        result = result * PRIME + ($receivers == null ? 43 : $receivers.hashCode());
        final java.lang.Object $data = this.getData();
        result = result * PRIME + ($data == null ? 43 : $data.hashCode());
        return result;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "IMBatchSendResult(sender=" + this.getSender() + ", receivers=" + this.getReceivers() + ", code=" + this.getCode() + ", data=" + this.getData() + ")";
    }
}
