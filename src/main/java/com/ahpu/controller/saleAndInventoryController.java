package com.ahpu.controller;

import com.ahpu.pojo.saleAndInventory;
import com.ahpu.service.saleAndInventoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/SAI")
public class saleAndInventoryController {
    @Autowired
    saleAndInventoryService saleAndInventoryService;
    @RequestMapping(value = "/getSAI",method = RequestMethod.GET)
    @ResponseBody
    public List<saleAndInventory> allSAI(){
        List<saleAndInventory> SAIList = saleAndInventoryService.getSAI();
        return SAIList;
    }

}
