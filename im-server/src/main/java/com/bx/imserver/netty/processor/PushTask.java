package com.bx.imserver.netty.processor;

import com.bx.imcommon.model.IMUserInfo;
import io.netty.channel.ChannelFuture;

public class PushTask {
    private final IMUserInfo receiver;
    private final ChannelFuture future;

    public IMUserInfo getReceiver() {
        return this.receiver;
    }

    public ChannelFuture getFuture() {
        return this.future;
    }

    public PushTask(final IMUserInfo receiver, final ChannelFuture future) {
        this.receiver = receiver;
        this.future = future;
    }
}
