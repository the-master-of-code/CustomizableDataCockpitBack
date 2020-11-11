package com.ahpu.service;

import com.ahpu.dao.saleAndInventoryDao;
import com.ahpu.pojo.saleAndInventory;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

import static org.junit.Assert.*;

public class saleAndInventoryServiceImplTest {

    @Test
    public void getSAI() {
        //初始化Spring容器，加载applicationContext.xml配置
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        //通过Spring容器，获取dao实例
        saleAndInventoryDao saiDao = (saleAndInventoryDao)ctx.getBean("saleAndInventoryDao");

        List<saleAndInventory> SAIList = saiDao.getSAI();
        System.out.print(SAIList);
    }

    @Test
    public void setSaleAndInventoryDao() {
    }
}