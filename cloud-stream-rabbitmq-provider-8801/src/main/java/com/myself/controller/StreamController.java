package com.myself.controller;

import com.myself.service.MessageService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author zxq
 * 2020/4/13
 */
@RestController
public class StreamController {

    @Resource
    private MessageService messageService;

    @GetMapping("provider/send")
    public void send(){
        messageService.send();
    }
}
