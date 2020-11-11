package com.ahpu.service;

import com.ahpu.pojo.sale;

import java.util.List;

public interface saleService {
    List<sale>  allSale(int quarter);
    List<sale>  allSale1();
}
