
package com.stalary.pf.push.service;

import com.alibaba.fastjson.JSONObject;
import com.stalary.pf.push.common.PushConstants;
import com.stalary.pf.push.common.WsMessage;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * MessageReceiver
 *
 * @author lirongqian
 * @since 2019/02/25
 */
@Service
@Slf4j
public class MessageService {

    public static String MESSAGE_CHANNEL = "message";

    public static String CLOSE_CHANNEL = "close";

    @Resource
    private WebSocketService webSocketService;

    public void receiveMessage(String message, String channel) {
        log.info("receive message channel {}, message {}", channel, message);
        if (PushConstants.MESSAGE_CHANNEL.getChannel().equals(channel)) {
            WsMessage wsMessage = JSONObject.parseObject(message, WsMessage.class);
            webSocketService.sendMessage(wsMessage.getUserId(), wsMessage.getMessage());
        } else if (PushConstants.CLOSE_CHANNEL.getChannel().equals(channel)) {
            webSocketService.close(Long.valueOf(message));
        }

    }
}