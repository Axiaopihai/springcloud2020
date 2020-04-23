package com.myself;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author zxq
 * 2020/4/8
 */
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
//@EnableHystrix
public class FeignHystrixApplication {
    public static void main(String[] args) {
        SpringApplication.run(FeignHystrixApplication.class,args);
    }
}
