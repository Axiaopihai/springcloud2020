package com.myself.controller;

import com.myself.service.OrderService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author zxq
 * 2020/4/17
 */
@RestController
public class OrderController {

    @Resource
    private OrderService orderService;

    @GetMapping("order/create")
    public void create(){
        orderService.create();
    }

    @GetMapping("order/search")
    public void search(){
        orderService.search();
    }

}
