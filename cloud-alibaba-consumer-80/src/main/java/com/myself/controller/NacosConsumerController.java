package com.myself.controller;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @author zxq
 * 2020/4/14
 */
@RestController
public class NacosConsumerController {

    private final String URL = "http://cloud-alibaba-provider/";

    @Resource
    private RestTemplate restTemplate;

    @GetMapping("nacos/consumer/hello")
    public String hello(){
        return restTemplate.getForObject(URL+"nacos/provider/hello",String.class);
    }


}
