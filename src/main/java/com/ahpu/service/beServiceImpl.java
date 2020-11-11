package com.ahpu.service;

import com.ahpu.dao.beDao;
import com.ahpu.pojo.budgetAndExpenses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class beServiceImpl implements beService {
    @Autowired
    private beDao bedao;

    public beDao getBedao() {
        return bedao;
    }

    public void setBedao(beDao bedao) {
        this.bedao = bedao;
    }

    public List<budgetAndExpenses> getBE(String type) {
        List<budgetAndExpenses> result = bedao.getBE(type);
        return result;
    }
}
