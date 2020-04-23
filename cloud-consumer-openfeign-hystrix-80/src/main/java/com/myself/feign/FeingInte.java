package com.myself.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author zxq
 * 2020/4/8
 */
@FeignClient(value = "CLOUD-PROVIDER-HYSTRIX",fallback = FeingInteImpl.class)
public interface FeingInte {

    @GetMapping("provider/hystrix")
    String getHystrix();

}
