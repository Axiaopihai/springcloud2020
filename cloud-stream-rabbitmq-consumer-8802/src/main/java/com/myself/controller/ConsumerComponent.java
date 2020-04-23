package com.myself.controller;

import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zxq
 * 2020/4/13
 */

@EnableBinding(Sink.class)
public class ConsumerComponent {

    @StreamListener(Sink.INPUT)
    public void input(Message<String> message){
        System.out.println("消费："+message.getPayload());
    }

}
