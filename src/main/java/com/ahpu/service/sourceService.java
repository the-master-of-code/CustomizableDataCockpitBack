package com.ahpu.service;

import com.ahpu.pojo.source;

import java.util.List;

public interface sourceService {
    List<source> getTableName(String database);
    List<source> getStringName(String table,String database);
}
