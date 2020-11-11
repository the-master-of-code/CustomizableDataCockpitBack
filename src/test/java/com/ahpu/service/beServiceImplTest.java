package com.ahpu.service;

import com.ahpu.dao.beDao;
import com.ahpu.pojo.budgetAndExpenses;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

import static org.junit.Assert.*;

public class beServiceImplTest {

    @Test
    public void getBE() {
        ApplicationContext ctx = new ClassPathXmlApplicationContext(
                "applicationContext.xml");
        beDao bedao = (beDao)ctx.getBean("beDao");

        List<budgetAndExpenses> result = bedao.getBE("预算");
        System.out.print(result);
    }
}