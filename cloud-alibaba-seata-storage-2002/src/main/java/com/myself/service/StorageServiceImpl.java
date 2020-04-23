package com.myself.service;

import bean.AccountStorage;
import com.myself.dao.StorageDao;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author zxq
 * 2020/4/17
 */
@Service
public class StorageServiceImpl implements StorageService {

    @Resource
    private StorageDao storageDao;
    @Override
    public AccountStorage search() {
        try {
            Thread.sleep(20000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return storageDao.search(1);
    }
}
