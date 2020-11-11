package com.ahpu.controller;

import com.ahpu.pojo.budgetAndExpenses;
import com.ahpu.service.beService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/BAE")
public class beController {
    @Autowired
    private beService beservice;
    @RequestMapping("/getBE/{type}")
    @ResponseBody
    public List<budgetAndExpenses> getBE(@PathVariable("type") String type){
        List<budgetAndExpenses> result = beservice.getBE(type);
        return result;
    }
}
