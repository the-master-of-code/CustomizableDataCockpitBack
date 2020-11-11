package com.ahpu.dao;

import com.ahpu.pojo.saleAndInventory;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface saleAndInventoryDao {
    @Select("select * from saleandinventory")
    List<saleAndInventory> getSAI();
}
