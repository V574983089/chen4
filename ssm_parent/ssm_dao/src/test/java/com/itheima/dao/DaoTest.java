package com.itheima.dao;

import com.itheima.pojo.Items;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class DaoTest {
//    @Test
//    public void test01(){
public static void main(String[] args) {
        //【创建spring的核心容器对象】【创建出的对象,存储在核心容器中(相当于工厂)】
        ApplicationContext act = new ClassPathXmlApplicationContext("spring-mybatis.xml");
        //从核心容器中获取对象
        ItemsDao itemsDao = (ItemsDao) act.getBean("itemsDao");
        List<Items> list = itemsDao.list();
        for (Items items : list) {
            System.out.println(items);
        }
    }
}
