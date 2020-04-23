package com.myself.feigninterface;

import bean.Account;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author zxq
 * 2020/4/7
 */
@FeignClient(value = "CLOUD-PAYMENT-PROVIDER")
public interface FeignInte {

    @GetMapping("/getEmp/{id}")
    Account getEmp(@PathVariable("id") Integer id);


}
