package com.itheima.controller;

import com.itheima.pojo.Items;
import com.itheima.service.ItemsService;
import com.itheima.service.impl.ItemsSerivceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("items")
public class ItemController{
    @Autowired
    private ItemsService itemsService;

    //查询商品列表
    @RequestMapping("list")
    public String list(Model model){
        List<Items> list = itemsService.list();
        model.addAttribute("items",list);
        return "items";
    }

    //保存商品
    @RequestMapping("save")
    public String add(Items items){
        itemsService.add(items);
        System.out.println("保存成功");
        return "redirect:/items/list";
    }
}
