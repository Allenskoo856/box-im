package com.bx.imserver.task;

import com.bx.imcommon.contant.IMRedisKey;
import com.bx.imcommon.enums.IMCmdType;
import com.bx.imcommon.model.IMForceLogoutInfo;
import com.bx.imcommon.mq.RedisMQListener;
import com.bx.imserver.netty.processor.AbstractMessageProcessor;
import com.bx.imserver.netty.processor.ProcessorFactory;
import org.springframework.stereotype.Component;

@Component
@RedisMQListener(queue = IMRedisKey.IM_USER_FORCE_LOGOUT_QUEUE)
public class PullForceLogoutTask extends AbstractPullMessageTask<IMForceLogoutInfo> {
    private static final org.slf4j.Logger log = org.slf4j.LoggerFactory.getLogger(PullForceLogoutTask.class);

    @Override
    public void onMessage(IMForceLogoutInfo logoutInfo) {
        AbstractMessageProcessor processor = ProcessorFactory.createProcessor(IMCmdType.FORCE_LOGOUT);
        processor.process(logoutInfo);
    }

    public PullForceLogoutTask() {
    }
}
