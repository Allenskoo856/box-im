package com.bx.implatform.listener;

import com.bx.imclient.annotation.IMListener;
import com.bx.imclient.listener.MessageListener;
import com.bx.imcommon.enums.IMListenerType;
import com.bx.imcommon.enums.IMSendCode;
import com.bx.imcommon.model.IMSendResult;
import com.bx.implatform.vo.GroupMessageVO;
import org.springframework.data.redis.core.RedisTemplate;
import java.util.List;

@IMListener(type = IMListenerType.GROUP_MESSAGE)
public class GroupMessageListener implements MessageListener<GroupMessageVO> {
    private static final org.slf4j.Logger log = org.slf4j.LoggerFactory.getLogger(GroupMessageListener.class);
    private final RedisTemplate<String, Object> redisTemplate;

    @Override
    public void process(List<IMSendResult<GroupMessageVO>> results) {
        for (IMSendResult<GroupMessageVO> result : results) {
            GroupMessageVO messageInfo = result.getData();
            if (result.getCode().equals(IMSendCode.SUCCESS.code())) {
                log.info("消息送达，消息id:{}，发送者:{},接收者:{},终端:{}", messageInfo.getId(), result.getSender().getId(), result.getReceiver().getId(), result.getReceiver().getTerminal());
            }
        }
    }

    public GroupMessageListener(final RedisTemplate<String, Object> redisTemplate) {
        this.redisTemplate = redisTemplate;
    }
}
