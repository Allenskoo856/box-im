package com.bx.imcommon.model;

public class IMSendInfo<T> {
    /**
     * 命令
     */
    private Integer cmd;
    /**
     * 推送消息体
     */
    private T data;

    public IMSendInfo() {
    }

    /**
     * 命令
     */
    public Integer getCmd() {
        return this.cmd;
    }

    /**
     * 推送消息体
     */
    public T getData() {
        return this.data;
    }

    /**
     * 命令
     */
    public void setCmd(final Integer cmd) {
        this.cmd = cmd;
    }

    /**
     * 推送消息体
     */
    public void setData(final T data) {
        this.data = data;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object o) {
        if (o == this) return true;
        if (!(o instanceof IMSendInfo)) return false;
        final IMSendInfo<?> other = (IMSendInfo<?>) o;
        if (!other.canEqual((java.lang.Object) this)) return false;
        final java.lang.Object this$cmd = this.getCmd();
        final java.lang.Object other$cmd = other.getCmd();
        if (this$cmd == null ? other$cmd != null : !this$cmd.equals(other$cmd)) return false;
        final java.lang.Object this$data = this.getData();
        final java.lang.Object other$data = other.getData();
        if (this$data == null ? other$data != null : !this$data.equals(other$data)) return false;
        return true;
    }

    protected boolean canEqual(final java.lang.Object other) {
        return other instanceof IMSendInfo;
    }

    @java.lang.Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final java.lang.Object $cmd = this.getCmd();
        result = result * PRIME + ($cmd == null ? 43 : $cmd.hashCode());
        final java.lang.Object $data = this.getData();
        result = result * PRIME + ($data == null ? 43 : $data.hashCode());
        return result;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "IMSendInfo(cmd=" + this.getCmd() + ", data=" + this.getData() + ")";
    }
}
