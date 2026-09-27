package com.bx.imcommon.model;

import com.bx.imcommon.enums.IMTerminalType;
import java.util.LinkedList;
import java.util.List;

public class IMGroupMessage<T> {
    /**
     * 发送方
     */
    private IMUserInfo sender;
    /**
     * 接收者id列表(群成员列表,为空则不会推送)
     */
    private List<Long> recvIds = new LinkedList<>();
    /**
     * 接收者终端类型,默认全部
     */
    private List<Integer> recvTerminals = IMTerminalType.codes();
    /**
     * 是否发送给自己的其他终端,默认true
     */
    private Boolean sendToSelf = true;
    /**
     * 是否需要回推发送结果,默认true
     */
    private Boolean sendResult = true;
    /**
     * 消息内容
     */
    private T data;

    public IMGroupMessage() {
    }

    /**
     * 发送方
     */
    public IMUserInfo getSender() {
        return this.sender;
    }

    /**
     * 接收者id列表(群成员列表,为空则不会推送)
     */
    public List<Long> getRecvIds() {
        return this.recvIds;
    }

    /**
     * 接收者终端类型,默认全部
     */
    public List<Integer> getRecvTerminals() {
        return this.recvTerminals;
    }

    /**
     * 是否发送给自己的其他终端,默认true
     */
    public Boolean getSendToSelf() {
        return this.sendToSelf;
    }

    /**
     * 是否需要回推发送结果,默认true
     */
    public Boolean getSendResult() {
        return this.sendResult;
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
     * 接收者id列表(群成员列表,为空则不会推送)
     */
    public void setRecvIds(final List<Long> recvIds) {
        this.recvIds = recvIds;
    }

    /**
     * 接收者终端类型,默认全部
     */
    public void setRecvTerminals(final List<Integer> recvTerminals) {
        this.recvTerminals = recvTerminals;
    }

    /**
     * 是否发送给自己的其他终端,默认true
     */
    public void setSendToSelf(final Boolean sendToSelf) {
        this.sendToSelf = sendToSelf;
    }

    /**
     * 是否需要回推发送结果,默认true
     */
    public void setSendResult(final Boolean sendResult) {
        this.sendResult = sendResult;
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
        if (!(o instanceof IMGroupMessage)) return false;
        final IMGroupMessage<?> other = (IMGroupMessage<?>) o;
        if (!other.canEqual((java.lang.Object) this)) return false;
        final java.lang.Object this$sendToSelf = this.getSendToSelf();
        final java.lang.Object other$sendToSelf = other.getSendToSelf();
        if (this$sendToSelf == null ? other$sendToSelf != null : !this$sendToSelf.equals(other$sendToSelf)) return false;
        final java.lang.Object this$sendResult = this.getSendResult();
        final java.lang.Object other$sendResult = other.getSendResult();
        if (this$sendResult == null ? other$sendResult != null : !this$sendResult.equals(other$sendResult)) return false;
        final java.lang.Object this$sender = this.getSender();
        final java.lang.Object other$sender = other.getSender();
        if (this$sender == null ? other$sender != null : !this$sender.equals(other$sender)) return false;
        final java.lang.Object this$recvIds = this.getRecvIds();
        final java.lang.Object other$recvIds = other.getRecvIds();
        if (this$recvIds == null ? other$recvIds != null : !this$recvIds.equals(other$recvIds)) return false;
        final java.lang.Object this$recvTerminals = this.getRecvTerminals();
        final java.lang.Object other$recvTerminals = other.getRecvTerminals();
        if (this$recvTerminals == null ? other$recvTerminals != null : !this$recvTerminals.equals(other$recvTerminals)) return false;
        final java.lang.Object this$data = this.getData();
        final java.lang.Object other$data = other.getData();
        if (this$data == null ? other$data != null : !this$data.equals(other$data)) return false;
        return true;
    }

    protected boolean canEqual(final java.lang.Object other) {
        return other instanceof IMGroupMessage;
    }

    @java.lang.Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final java.lang.Object $sendToSelf = this.getSendToSelf();
        result = result * PRIME + ($sendToSelf == null ? 43 : $sendToSelf.hashCode());
        final java.lang.Object $sendResult = this.getSendResult();
        result = result * PRIME + ($sendResult == null ? 43 : $sendResult.hashCode());
        final java.lang.Object $sender = this.getSender();
        result = result * PRIME + ($sender == null ? 43 : $sender.hashCode());
        final java.lang.Object $recvIds = this.getRecvIds();
        result = result * PRIME + ($recvIds == null ? 43 : $recvIds.hashCode());
        final java.lang.Object $recvTerminals = this.getRecvTerminals();
        result = result * PRIME + ($recvTerminals == null ? 43 : $recvTerminals.hashCode());
        final java.lang.Object $data = this.getData();
        result = result * PRIME + ($data == null ? 43 : $data.hashCode());
        return result;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "IMGroupMessage(sender=" + this.getSender() + ", recvIds=" + this.getRecvIds() + ", recvTerminals=" + this.getRecvTerminals() + ", sendToSelf=" + this.getSendToSelf() + ", sendResult=" + this.getSendResult() + ", data=" + this.getData() + ")";
    }
}
