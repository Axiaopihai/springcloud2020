package com.myself.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zxq
 * 2020/4/14
 */
@RestController
@RefreshScope
public class NacosProviderController {

    @Value("${spring.info}")
    private String versionInfo;

    @GetMapping("nacos/provider/hello")
    public String helloWorld(){
        return "hello nacos provider"+versionInfo;
    }


}
