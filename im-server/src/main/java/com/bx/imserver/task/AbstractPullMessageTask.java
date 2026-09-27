package com.bx.imserver.task;

import com.bx.imcommon.mq.RedisMQConsumer;
import com.bx.imserver.netty.IMServerGroup;
import org.springframework.beans.factory.annotation.Autowired;

public abstract class AbstractPullMessageTask<T> extends RedisMQConsumer<T> {
    private static final org.slf4j.Logger log = org.slf4j.LoggerFactory.getLogger(AbstractPullMessageTask.class);
    @Autowired
    private IMServerGroup serverGroup;

    @Override
    public String generateKey() {
        return String.join(":", super.generateKey(), IMServerGroup.serverId + "");
    }

    @Override
    public Boolean isReady() {
        return serverGroup.isReady();
    }
}
