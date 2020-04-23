package com.myself.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zxq
 * 2020/4/10
 */
@RestController
@RefreshScope
public class ConfigController {

    @Value("${spring.info}")
    private String springInfo;

    @GetMapping("config/spring/info")
    public String getInfo(){
        return springInfo;
    }
}
