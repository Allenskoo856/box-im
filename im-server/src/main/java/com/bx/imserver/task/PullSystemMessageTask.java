package com.bx.imserver.task;

import com.bx.imcommon.contant.IMRedisKey;
import com.bx.imcommon.enums.IMCmdType;
import com.bx.imcommon.model.IMRecvInfo;
import com.bx.imcommon.mq.RedisMQListener;
import com.bx.imserver.netty.processor.AbstractMessageProcessor;
import com.bx.imserver.netty.processor.ProcessorFactory;
import org.springframework.stereotype.Component;

/**
 * @author: Blue
 * @date: 2024-07-16
 * @version: 1.0
 */
@Component
@RedisMQListener(queue = IMRedisKey.IM_MESSAGE_SYSTEM_QUEUE, batchSize = 10)
public class PullSystemMessageTask extends AbstractPullMessageTask<IMRecvInfo> {
    private static final org.slf4j.Logger log = org.slf4j.LoggerFactory.getLogger(PullSystemMessageTask.class);

    @Override
    public void onMessage(IMRecvInfo recvInfo) {
        AbstractMessageProcessor processor = ProcessorFactory.createProcessor(IMCmdType.SYSTEM_MESSAGE);
        processor.process(recvInfo);
    }
}
