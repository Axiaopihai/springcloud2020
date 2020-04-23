package com.myself.controller;

import bean.Account;
import com.myself.feigninterface.FeignInte;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author zxq
 * 2020/4/7
 */
@RestController
public class FeignController {

    @Resource
    private FeignInte feignInte;

    @GetMapping("consumer/getEmp/{id}")
    public Account getEmp(@PathVariable("id") Integer id){
        return feignInte.getEmp(id);
    }


}
