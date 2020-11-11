package com.ahpu.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class saleAndInventory {
    private int id;
    private String goodsName;
    private float sales;
    private float inventory;

}
