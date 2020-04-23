package com.myself.controller;

import bean.AccountStorage;
import com.myself.service.StorageService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author zxq
 * 2020/4/17
 */
@RestController
public class StorageControlller {

    @Resource
    private StorageService storageService;

    @GetMapping("storage/search")
    public AccountStorage search(){
        return storageService.search();
    }
}
