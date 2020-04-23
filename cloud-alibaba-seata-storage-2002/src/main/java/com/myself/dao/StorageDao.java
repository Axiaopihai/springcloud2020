package com.myself.dao;

import bean.AccountStorage;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author zxq
 * 2020/4/17
 */
@Mapper
public interface StorageDao {
    AccountStorage search(int i);
}
