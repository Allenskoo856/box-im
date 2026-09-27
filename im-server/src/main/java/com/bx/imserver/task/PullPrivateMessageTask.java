package com.bx.imserver.task;

import com.bx.imcommon.contant.IMRedisKey;
import com.bx.imcommon.enums.IMCmdType;
import com.bx.imcommon.model.IMRecvInfo;
import com.bx.imcommon.mq.RedisMQListener;
import com.bx.imserver.netty.processor.AbstractMessageProcessor;
import com.bx.imserver.netty.processor.ProcessorFactory;
import org.springframework.stereotype.Component;

@Component
@RedisMQListener(queue = IMRedisKey.IM_MESSAGE_PRIVATE_QUEUE, batchSize = 100, period = 10)
public class PullPrivateMessageTask extends AbstractPullMessageTask<IMRecvInfo> {
    private static final org.slf4j.Logger log = org.slf4j.LoggerFactory.getLogger(PullPrivateMessageTask.class);

    @Override
    public void onMessage(IMRecvInfo recvInfo) {
        AbstractMessageProcessor processor = ProcessorFactory.createProcessor(IMCmdType.PRIVATE_MESSAGE);
        processor.process(recvInfo);
    }

    public PullPrivateMessageTask() {
    }
}
