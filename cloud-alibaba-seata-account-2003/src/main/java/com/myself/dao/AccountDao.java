package com.myself.dao;

import bean.AccountAccount;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author zxq
 * 2020/4/17
 */
@Mapper
public interface AccountDao {
    AccountAccount search(int i);

    void insert(AccountAccount account);
}
