package com.myself.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zxq
 * 2020/4/12
 */
@RestController
public class PortController {

    @Value("${server.port}")
    private String port;

    @PostMapping("config/server/port")
    public String getPort(){
        return port;
    }


}
