package com.itheima.service.impl;

import com.itheima.dao.ItemsDao;
import com.itheima.pojo.Items;
import com.itheima.service.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

//商品业务逻辑处理
@Service
//@Transactional
public class ItemsSerivceImpl implements ItemsService {

    @Autowired//使用Autowired注解注入Dao对象
    private ItemsDao itemsDao;

    @Override
    public List<Items> list() {
        return itemsDao.list();
    }

    @Override
    public void add(Items items) {
        itemsDao.save(items);
    }
}
