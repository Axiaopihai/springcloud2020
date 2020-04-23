package com.myself.controller;

import bean.AccountAccount;
import com.myself.service.AccountService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author zxq
 * 2020/4/17
 */
@RestController
public class AccountController {

    @Resource
    private AccountService accountService;

    @GetMapping("account/search")
    public AccountAccount search(){
        return accountService.search();
    }

    @GetMapping("account/insert")
    public void insert(){
        accountService.insert();
    }
}
