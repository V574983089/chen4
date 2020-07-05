package com.itheima.dao;

import com.itheima.pojo.Items;

import java.util.List;

public interface ItemsDao {
    //查询商品列表
    List<Items> list();

    //保存操作
    void save(Items items);
}
