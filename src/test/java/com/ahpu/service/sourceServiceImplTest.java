package com.ahpu.service;

import com.ahpu.dao.sourceDao;
import com.ahpu.pojo.source;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;


public class sourceServiceImplTest {

    @Test
    public void getTableName() {
        ApplicationContext ctx = new ClassPathXmlApplicationContext(
                "applicationContext.xml");
        sourceDao sourcedao = (sourceDao) ctx.getBean("sourceDao");

        List<source> result =
                sourcedao.getTableName("datacockpitsystem");
        System.out.print(result);
    }

    @Test
    public void getStringName() {
        ApplicationContext ctx = new ClassPathXmlApplicationContext(
                "applicationContext.xml");
        sourceDao sourcedao = (sourceDao) ctx.getBean("sourceDao");

        List<source> result = sourcedao.getStringName("sale",
                "datacockpitsystem");
        System.out.print(result);
    }
}