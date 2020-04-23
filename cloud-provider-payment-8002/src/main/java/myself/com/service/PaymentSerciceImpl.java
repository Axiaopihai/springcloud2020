package myself.com.service;


import bean.Account;
import myself.com.dao.PaymentDao;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author zxq
 * 2020/4/5
 */
@Service
public class PaymentSerciceImpl implements PaymentService {

    @Resource
    private PaymentDao paymentDao;

    @Override
    public Account getEmp(Integer id) {
       return paymentDao.queryEmpById(id);
    }

    @Override
    public Account insertEmp(Account account) {
         paymentDao.insertEmp(account);
         return account;
    }


}
