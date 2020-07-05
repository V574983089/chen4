package com.itheima.service;

import com.itheima.pojo.Items;

import java.util.List;

public interface ItemsService {
    //查询商品列表
    List<Items> list();
    //保存商品
    void add(Items items);
}
