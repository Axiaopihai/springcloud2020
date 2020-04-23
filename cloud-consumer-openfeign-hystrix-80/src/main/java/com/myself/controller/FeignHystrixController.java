package com.myself.controller;

import com.myself.feign.FeingInte;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author zxq
 * 2020/4/8
 */
@RestController
public class FeignHystrixController {


    @Resource
    private FeingInte feingInte;


    @GetMapping("consumer/provider/hystrix")
//    @HystrixCommand(fallbackMethod = "getHystrixHandler",commandProperties = {
//            @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds",value = "3000")
//    })
    public String getHystrix(){
        return feingInte.getHystrix();
    }

    public String getHystrixHandler(){
        return "consumer服务繁忙或出错";
    }

}
