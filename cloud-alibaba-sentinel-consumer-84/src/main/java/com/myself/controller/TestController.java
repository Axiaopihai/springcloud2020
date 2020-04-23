package com.myself.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

/**
 * @author zxq
 * 2020/4/16
 */
@RestController
public class TestController {

    @GetMapping("/consumer")
    public String hello(){
        return "helloworld: "+UUID.randomUUID().toString();
    }
}
