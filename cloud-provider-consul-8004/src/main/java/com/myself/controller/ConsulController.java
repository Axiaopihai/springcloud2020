package com.myself.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zxq
 * 2020/4/7
 */
@RestController
public class ConsulController {

    @GetMapping("consul")
    public void printInfo(){
        System.out.println("consul-test");
    }
}
