package com.itheima;

import com.itheima.pojo.Items;
import com.itheima.service.ItemsService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class ServiceTest {
    public static void main(String[] args) {
        //【创建spring的核心容器对象】【创建出的对象,存储在核心容器中(相当于工厂)】
        ApplicationContext act = new ClassPathXmlApplicationContext("spring-service.xml");
        //从核心容器中获取对象
        ItemsService itemsSerivce = (ItemsService) act.getBean("itemsSerivceImpl");
        List<Items> list = itemsSerivce.list();
        for (Items items : list) {
            System.out.println(items);
        }
    }
}
