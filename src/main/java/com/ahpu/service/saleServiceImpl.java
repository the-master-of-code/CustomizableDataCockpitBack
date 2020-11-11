package com.ahpu.service;

import com.ahpu.dao.saleDao;
import com.ahpu.pojo.sale;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class saleServiceImpl implements saleService {

    //调用Dao层 创建一个set方法 方便Spring管理
    private saleDao saledao;

    public void setSaledao(saleDao saledao) {
        this.saledao = saledao;
    }

    public List<sale> allSale(int quarter) {
        return saledao.allSale(quarter);
    }

    public List<sale> allSale1() {
        return saledao.allSale1();
    }
}
