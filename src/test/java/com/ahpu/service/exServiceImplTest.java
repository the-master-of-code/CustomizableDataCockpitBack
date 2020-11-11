package com.ahpu.service;

import com.ahpu.dao.exDao;
import com.ahpu.pojo.expenditure;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

import static org.junit.Assert.*;

public class exServiceImplTest {

    @Test
    public void getEx() {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        exDao exdao = (exDao)ctx.getBean("exDao");

        List<expenditure> result = exdao.getEx();
        System.out.print(result);
    }
}