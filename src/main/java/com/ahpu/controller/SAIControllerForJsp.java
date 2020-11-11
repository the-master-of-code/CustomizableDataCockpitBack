package com.ahpu.controller;

import com.ahpu.pojo.saleAndInventory;
import com.ahpu.service.saleAndInventoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/SAI")
public class SAIControllerForJsp {
    @Autowired
    private saleAndInventoryService saleAndInventoryService;
    @RequestMapping("/getSAIforjsp")
    public String list(Model model){
        List<saleAndInventory> SAIList = saleAndInventoryService.getSAI();
        model.addAttribute("SAIList", SAIList);
        return "saiList";
    }
}
