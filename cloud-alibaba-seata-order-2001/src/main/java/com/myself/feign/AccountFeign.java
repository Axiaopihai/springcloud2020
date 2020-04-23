package com.myself.feign;

import bean.AccountAccount;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author zxq
 * 2020/4/17
 */
@FeignClient(name = "cloud-alibaba-seata-account")
public interface AccountFeign {

    @GetMapping("account/search")
     AccountAccount search();

    @GetMapping("account/insert")
    AccountAccount insert();
}
