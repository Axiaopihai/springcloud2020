package com.myself.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zxq
 * 2020/4/16
 */
@RestController
public class SentinelController {

    @GetMapping("provider/sentinel/hello")
    public String helloWorld(){
        return "hello-world-8402";
    }

}
