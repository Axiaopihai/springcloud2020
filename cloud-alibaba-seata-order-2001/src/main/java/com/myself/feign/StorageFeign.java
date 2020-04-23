package com.myself.feign;

import bean.AccountOrder;
import bean.AccountStorage;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author zxq
 * 2020/4/17
 */
@FeignClient(name = "cloud-alibaba-seata-storage")
public interface StorageFeign {

    @GetMapping("storage/search")
    AccountStorage search();
}
