package com.myself.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @author zxq
 * 2020/4/16
 */
@RestController
public class SenConsumerController {
    public final String URL = "http://cloud-alibaba-sentinel-server";

    @Resource
    private RestTemplate restTemplate;

    @GetMapping("/consumer/sentinel/hello")
    @SentinelResource(value = "falback",
            fallback = "fallbackHandler",
            blockHandler = "blockMethod")
    public String hello(@PathVariable("id") Integer id){
        if (id<0){
            throw new RuntimeException("抛出错误");
        }
        return restTemplate.getForObject(URL+"/provider/sentinel/hello",String.class);
    }

    public String fallbackHandler(@PathVariable("id") Integer id,Throwable e){
        return "错误参数："+id+e.getMessage();
    }

    public String blockMethod(@PathVariable("id") Integer id,BlockException exception){
        return "block:"+id;

    }
}
