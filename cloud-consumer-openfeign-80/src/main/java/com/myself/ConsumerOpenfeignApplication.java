package com.myself;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author zxq
 * 2020/4/7
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class ConsumerOpenfeignApplication {
    public static void main(String[] args) {
        SpringApplication.run(ConsumerOpenfeignApplication.class,args);
    }
}
