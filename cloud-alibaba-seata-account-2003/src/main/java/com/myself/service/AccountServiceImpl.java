package com.myself.service;

import bean.AccountAccount;
import com.myself.dao.AccountDao;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author zxq
 * 2020/4/17
 */
@Service
public class AccountServiceImpl implements AccountService {

    @Resource
    private AccountDao accountDao;
    @Override
    public AccountAccount search() {
        return accountDao.search(1);
    }

    @Override
    public void insert() {
        AccountAccount account = new AccountAccount(6, "rose3", "rose");
        accountDao.insert(account);
    }
}
