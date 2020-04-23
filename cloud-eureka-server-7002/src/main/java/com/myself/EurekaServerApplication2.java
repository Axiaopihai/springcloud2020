package com.myself;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author zxq
 * 2020/4/6
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaServerApplication2 {
    public static void main(String[] args) {
        SpringApplication.run(EurekaServerApplication2.class,args);
    }
}
