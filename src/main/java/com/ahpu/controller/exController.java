package com.ahpu.controller;

import com.ahpu.pojo.expenditure;
import com.ahpu.service.exService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/expenditure")
public class exController {
    @Autowired
    private exService exservice;
    @RequestMapping("getEx")
    @ResponseBody
    public List<expenditure> allExpenditure(){
        List<expenditure> exList = exservice.getEx();
        return exList;
    }
}
