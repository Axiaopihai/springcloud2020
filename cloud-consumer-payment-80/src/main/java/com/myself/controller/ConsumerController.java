package com.myself.controller;


import bean.Account;

import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author zxq
 * 2020/4/5
 */
@RestController
public class ConsumerController {

    private final String URL_LOCATION="http://CLOUD-PAYMENT-PROVIDER";

    @Resource
    private RestTemplate restTemplate;

    @Resource
    private DiscoveryClient discoveryClient;

    @GetMapping("consumer/getEmp/{id}")
    public Account consumer(@PathVariable("id") Integer id){
        return restTemplate.getForObject(URL_LOCATION+"/getEmp/"+id,Account.class);
    }

    @GetMapping("consumer/discovery")
    public void discovery(){
        List<String> services = discoveryClient.getServices();
        for (String service :
                services) {
            System.out.println(service);
        }
    }

    @GetMapping("searchPort")
    public String searchPort(){
        return restTemplate.getForObject(URL_LOCATION+"/serverPort",String.class);
    }

}
