package com.myself.controller;

import com.netflix.hystrix.contrib.javanica.annotation.DefaultProperties;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

/**
 * @author zxq
 * 2020/4/8
 */
@RestController
public class HystrixController {

    @GetMapping("provider/hystrix/{i}")
    @HystrixCommand(fallbackMethod = "getHystrixHandler",commandProperties = {
            @HystrixProperty(name = "circuitBreaker.enabled",value = "true"),
            @HystrixProperty(name = "circuitBreaker.requestVolumeThreshold",value = "10"),
            @HystrixProperty(name = "circuitBreaker.sleepWindowInMilliseconds",value = "1000"),
            @HystrixProperty(name = "circuitBreaker.errorThresholdPercentage",value = "60")
    })
    public String getHystrix(@PathVariable("i") Integer i){
        if (i<0){
            throw new RuntimeException("抛出异常啦");
        }
        return "provider"+UUID.randomUUID().toString();
    }

    public String getHystrixHandler(@PathVariable("i") Integer i){
        return "provider服务繁忙或出错"+i;
    }


}
