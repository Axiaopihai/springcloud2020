package com.myself;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author zxq
 * 2020/4/16
 */
@SpringBootApplication
@EnableDiscoveryClient
public class SentinelConsumerApplication {
    public static void main(String[] args) {
        SpringApplication.run(SentinelConsumerApplication.class,args);
    }
}
