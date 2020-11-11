package com.ahpu.service;

import com.ahpu.dao.sourceDao;
import com.ahpu.pojo.source;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class sourceServiceImpl implements sourceService {
    public sourceDao getSourcedao() {
        return sourcedao;
    }

    public void setSourcedao(sourceDao sourcedao) {
        this.sourcedao = sourcedao;
    }

    @Autowired
    private sourceDao sourcedao;

    public List<source> getTableName(String database) {
        List<source> tList = sourcedao.getTableName(database);
        return tList;
    }

    public List<source> getStringName(String table, String database) {
        List<source> sList = sourcedao.getStringName(table,database);
        return sList;
    }
}
