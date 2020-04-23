package com.myself.service;

import bean.AccountAccount;
import bean.AccountOrder;
import bean.AccountStorage;
import com.myself.dao.OrderDao;
import com.myself.feign.AccountFeign;
import com.myself.feign.StorageFeign;
import io.seata.spring.annotation.GlobalTransactional;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author zxq
 * 2020/4/17
 */
@Service
public class OrderServiceImpl implements OrderService {
    private Logger logger = LoggerFactory.getLogger(getClass());

    @Resource
    private OrderDao orderDao;
    @Resource
    private AccountFeign accountFeign;
    @Resource
    private StorageFeign storageFeign;

    @Override
    public void create() {
    }

    @Override
    @GlobalTransactional(name = "zxq_order",rollbackFor = Exception.class)
    public void search() {

        logger.info("=======>查询订单库");
        AccountOrder order = orderDao.search(1);
        logger.info("订单库结果："+order.toString());

        logger.info("=======>插入账户库");
        accountFeign.insert();
        logger.info("插入账户库结束");

        logger.info("=======>查询仓储库");
        AccountStorage storage = storageFeign.search();
        logger.info("仓储库结果："+storage.toString());


    }
}
