package com.cl.service;

import com.cl.util.DateUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
public class MessageService {
    @Autowired
    private SimpMessagingTemplate template;

    @Scheduled(fixedRate = 1000)
    public void trigger() {
        this.template.convertAndSend("/topic/message", "当前时间: " + DateUtil.getTime());
    }
}
