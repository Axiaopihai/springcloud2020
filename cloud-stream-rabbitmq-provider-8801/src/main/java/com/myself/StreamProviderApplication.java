package com.myself;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author zxq
 * 2020/4/13
 */
@SpringBootApplication
@EnableEurekaClient
public class StreamProviderApplication {
    public static void main(String[] args) {
        SpringApplication.run(StreamProviderApplication.class,args);
    }
}
