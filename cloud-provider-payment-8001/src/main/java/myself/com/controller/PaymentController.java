package myself.com.controller;


import bean.Account;
import myself.com.service.PaymentService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author zxq
 * 2020/4/5
 */
@RestController
public class PaymentController {

    @Value("${server.port}")
    private String port;

    @Resource
    private PaymentService paymentService;

    @GetMapping("getEmp/{id}")
    public Account getEmp(@PathVariable("id") Integer id){
        return paymentService.getEmp(id);

    }

    @GetMapping("Emp")
    public Account insertEmp(Account account){
        return paymentService.insertEmp(account);
    }

    @GetMapping("serverPort")
    public String getPort(){
        return port;
    }
}
