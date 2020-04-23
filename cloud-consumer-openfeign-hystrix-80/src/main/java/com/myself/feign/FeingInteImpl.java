package com.myself.feign;

import org.springframework.stereotype.Component;

/**
 * @author zxq
 * 2020/4/8
 */
@Component
public class FeingInteImpl implements FeingInte {
    @Override
    public String getHystrix() {
        return "服务器忙";
    }
}
