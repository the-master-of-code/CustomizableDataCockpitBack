package com.ahpu.service;

import com.ahpu.dao.exDao;
import com.ahpu.pojo.expenditure;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class exServiceImpl implements exService {
    @Autowired
    private exDao exdao;

    public exDao getExdao() {
        return exdao;
    }

    public void setExdao(exDao exdao) {
        this.exdao = exdao;
    }

    public List<expenditure> getEx() {
        return exdao.getEx();
    }
}
