package com.ahpu.service;

import com.ahpu.dao.saleDao;
import com.ahpu.pojo.sale;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

import static org.junit.Assert.*;

public class saleServiceImplTest {

    @Test
    public void setSaledao() {
    }

    @Test
    public void allSale() {
        //初始化Spring容器，加载applicationContext.xml配置
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        //通过Spring容器，获取dao实例
        saleDao saledao = (saleDao)ctx.getBean("saleDao");

        List<sale> result = saledao.allSale(1);
        System.out.print(result);

        List<sale> result1 = saledao.allSale1();
        System.out.print(result1);
    }
}