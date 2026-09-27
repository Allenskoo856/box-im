package com.bx.imserver.netty.tcp.endecode;

import com.bx.imcommon.model.IMSendInfo;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.ReplayingDecoder;
import io.netty.util.CharsetUtil;
import java.util.List;

public class MessageProtocolDecoder extends ReplayingDecoder {
    private static final org.slf4j.Logger log = org.slf4j.LoggerFactory.getLogger(MessageProtocolDecoder.class);

    @Override
    protected void decode(ChannelHandlerContext channelHandlerContext, ByteBuf byteBuf, List<Object> list) throws Exception {
        if (byteBuf.readableBytes() < 4) {
            return;
        }
        // 获取到包的长度
        long length = byteBuf.readLong();
        // 转成IMSendInfo
        ByteBuf contentBuf = byteBuf.readBytes((int) length);
        String content = contentBuf.toString(CharsetUtil.UTF_8);
        ObjectMapper objectMapper = new ObjectMapper();
        IMSendInfo sendInfo = objectMapper.readValue(content, IMSendInfo.class);
        list.add(sendInfo);
    }
}
