package com.bx.imclient.task;

import com.bx.imclient.listener.MessageListenerMulticaster;
import com.bx.imcommon.contant.IMRedisKey;
import com.bx.imcommon.enums.IMListenerType;
import com.bx.imcommon.model.IMBatchSendResult;
import com.bx.imcommon.mq.RedisMQListener;
import org.springframework.stereotype.Component;
import java.util.List;

@Component
@RedisMQListener(queue = IMRedisKey.IM_RESULT_SYSTEM_QUEUE, batchSize = 100)
public class SystemMessageResultResultTask extends AbstractMessageResultTask<IMBatchSendResult> {
    private final MessageListenerMulticaster listenerMulticaster;

    @Override
    public void onMessage(List<IMBatchSendResult> batchResults) {
        listenerMulticaster.multicast(IMListenerType.SYSTEM_MESSAGE, batchResults);
    }

    public SystemMessageResultResultTask(final MessageListenerMulticaster listenerMulticaster) {
        this.listenerMulticaster = listenerMulticaster;
    }
}
