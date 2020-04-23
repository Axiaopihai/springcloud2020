package myself.com.service;


import bean.Account;

/**
 * @author zxq
 * 2020/4/5
 */
public interface PaymentService {


    Account getEmp(Integer id);

    Account insertEmp(Account account);
}
