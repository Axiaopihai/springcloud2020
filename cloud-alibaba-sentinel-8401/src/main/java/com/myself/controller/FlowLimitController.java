package com.myself.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.myself.config.MyBlockHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zxq
 * 2020/4/15
 */
@RestController
public class FlowLimitController {

    @GetMapping("/testA")
    @SentinelResource(value = "testA",
            blockHandlerClass = MyBlockHandler.class,
            blockHandler = "blockHandler" )
    public String testA(){
        return "testA";
    }
    public String sentinelHandler(BlockException exception){
        return "限流A";
    }


    @GetMapping("/testB")
    public String testB(){
        return "testB";
    }

}
