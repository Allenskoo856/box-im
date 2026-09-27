package com.bx.imcommon.model;

import java.util.List;

public class IMRecvInfo {
    /**
     * 命令类型 IMCmdType
     */
    private Integer cmd;
    /**
     * 发送方
     */
    private IMUserInfo sender;
    /**
     * 接收方用户列表
     */
    List<IMUserInfo> receivers;
    /**
     * 是否需要回调发送结果
     */
    private Boolean sendResult;
    /**
     * 当前服务名（回调发送结果使用）
     */
    private String serviceName;
    /**
     * 推送消息体
     */
    private Object data;

    public IMRecvInfo() {
    }

    /**
     * 命令类型 IMCmdType
     */
    public Integer getCmd() {
        return this.cmd;
    }

    /**
     * 发送方
     */
    public IMUserInfo getSender() {
        return this.sender;
    }

    /**
     * 接收方用户列表
     */
    public List<IMUserInfo> getReceivers() {
        return this.receivers;
    }

    /**
     * 是否需要回调发送结果
     */
    public Boolean getSendResult() {
        return this.sendResult;
    }

    /**
     * 当前服务名（回调发送结果使用）
     */
    public String getServiceName() {
        return this.serviceName;
    }

    /**
     * 推送消息体
     */
    public Object getData() {
        return this.data;
    }

    /**
     * 命令类型 IMCmdType
     */
    public void setCmd(final Integer cmd) {
        this.cmd = cmd;
    }

    /**
     * 发送方
     */
    public void setSender(final IMUserInfo sender) {
        this.sender = sender;
    }

    /**
     * 接收方用户列表
     */
    public void setReceivers(final List<IMUserInfo> receivers) {
        this.receivers = receivers;
    }

    /**
     * 是否需要回调发送结果
     */
    public void setSendResult(final Boolean sendResult) {
        this.sendResult = sendResult;
    }

    /**
     * 当前服务名（回调发送结果使用）
     */
    public void setServiceName(final String serviceName) {
        this.serviceName = serviceName;
    }

    /**
     * 推送消息体
     */
    public void setData(final Object data) {
        this.data = data;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object o) {
        if (o == this) return true;
        if (!(o instanceof IMRecvInfo)) return false;
        final IMRecvInfo other = (IMRecvInfo) o;
        if (!other.canEqual((java.lang.Object) this)) return false;
        final java.lang.Object this$cmd = this.getCmd();
        final java.lang.Object other$cmd = other.getCmd();
        if (this$cmd == null ? other$cmd != null : !this$cmd.equals(other$cmd)) return false;
        final java.lang.Object this$sendResult = this.getSendResult();
        final java.lang.Object other$sendResult = other.getSendResult();
        if (this$sendResult == null ? other$sendResult != null : !this$sendResult.equals(other$sendResult)) return false;
        final java.lang.Object this$sender = this.getSender();
        final java.lang.Object other$sender = other.getSender();
        if (this$sender == null ? other$sender != null : !this$sender.equals(other$sender)) return false;
        final java.lang.Object this$receivers = this.getReceivers();
        final java.lang.Object other$receivers = other.getReceivers();
        if (this$receivers == null ? other$receivers != null : !this$receivers.equals(other$receivers)) return false;
        final java.lang.Object this$serviceName = this.getServiceName();
        final java.lang.Object other$serviceName = other.getServiceName();
        if (this$serviceName == null ? other$serviceName != null : !this$serviceName.equals(other$serviceName)) return false;
        final java.lang.Object this$data = this.getData();
        final java.lang.Object other$data = other.getData();
        if (this$data == null ? other$data != null : !this$data.equals(other$data)) return false;
        return true;
    }

    protected boolean canEqual(final java.lang.Object other) {
        return other instanceof IMRecvInfo;
    }

    @java.lang.Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final java.lang.Object $cmd = this.getCmd();
        result = result * PRIME + ($cmd == null ? 43 : $cmd.hashCode());
        final java.lang.Object $sendResult = this.getSendResult();
        result = result * PRIME + ($sendResult == null ? 43 : $sendResult.hashCode());
        final java.lang.Object $sender = this.getSender();
        result = result * PRIME + ($sender == null ? 43 : $sender.hashCode());
        final java.lang.Object $receivers = this.getReceivers();
        result = result * PRIME + ($receivers == null ? 43 : $receivers.hashCode());
        final java.lang.Object $serviceName = this.getServiceName();
        result = result * PRIME + ($serviceName == null ? 43 : $serviceName.hashCode());
        final java.lang.Object $data = this.getData();
        result = result * PRIME + ($data == null ? 43 : $data.hashCode());
        return result;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "IMRecvInfo(cmd=" + this.getCmd() + ", sender=" + this.getSender() + ", receivers=" + this.getReceivers() + ", sendResult=" + this.getSendResult() + ", serviceName=" + this.getServiceName() + ", data=" + this.getData() + ")";
    }
}
