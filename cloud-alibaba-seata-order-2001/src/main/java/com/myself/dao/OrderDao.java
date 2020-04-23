package com.myself.dao;

import bean.AccountOrder;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author zxq
 * 2020/4/17
 */
@Mapper
public interface OrderDao {

    AccountOrder search(int i);
}
