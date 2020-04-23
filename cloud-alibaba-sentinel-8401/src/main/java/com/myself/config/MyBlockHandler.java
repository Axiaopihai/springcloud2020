package com.myself.config;

import com.alibaba.csp.sentinel.slots.block.BlockException;

/**
 * @author zxq
 * 2020/4/15
 */
public class MyBlockHandler {

    public static String blockHandler(BlockException exception){
        return "global1 ....";
    }

    public static String blockHandler2(BlockException exception){
        return "global2 ....";
    }
}
