package com.ahpu.controller;

import com.ahpu.pojo.sale;
import com.ahpu.service.saleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/sale")
public class saleController {
    @Autowired
    saleService saleservice;
    @RequestMapping(value = "/getsaleCount/{quarter}",method = {RequestMethod.GET,RequestMethod.POST})
    @ResponseBody
    public List<sale> allSale(@PathVariable("quarter") Integer quarter){
        List<sale> saleList = saleservice.allSale(quarter);
        return saleList;
    }
    @RequestMapping("/getsaleCount")
    public  List<sale> allSale(){
        List<sale> saleList = saleservice.allSale1();
        return saleList;
    }
}
