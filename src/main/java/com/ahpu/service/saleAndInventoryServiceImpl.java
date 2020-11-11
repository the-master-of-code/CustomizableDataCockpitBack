package com.ahpu.service;

import com.ahpu.dao.saleAndInventoryDao;
import com.ahpu.pojo.saleAndInventory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class saleAndInventoryServiceImpl implements saleAndInventoryService {


    @Autowired
    private saleAndInventoryDao saleAndInventoryDao;

    public List<saleAndInventory> getSAI() {
        return saleAndInventoryDao.getSAI();
    }

    public saleAndInventoryDao getSaleAndInventoryDao() {
        return saleAndInventoryDao;
    }
    public void setSaleAndInventoryDao(saleAndInventoryDao saleAndInventoryDao) {
        this.saleAndInventoryDao = saleAndInventoryDao;
    }
}
