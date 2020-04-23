package com.iruleconfig;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author zxq
 * 2020/4/7
 */
@Configuration
public class RuleConfig {

    @Bean
    public IRule myRule(){
        return new RandomRule();
    }


}
