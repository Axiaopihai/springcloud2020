package com.myself;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author zxq
 * 2020/4/7
 */
@SpringBootApplication
@EnableDiscoveryClient
public class ProviderConsulApplication {
    public static void main(String[] args) {
        SpringApplication.run(ProviderConsulApplication.class,args);
    }
}
