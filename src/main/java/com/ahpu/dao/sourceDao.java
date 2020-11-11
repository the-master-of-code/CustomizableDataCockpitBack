package com.ahpu.dao;

import com.ahpu.pojo.source;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface sourceDao {
    @Select("select table_name from information_schema.tables where table_schema=#{database} ")
    List<source> getTableName(@Param("database")String database);
    @Select("select column_name\n" +
            "from information_schema.columns \n" +
            "where table_name=#{table} and table_schema=#{database}")
    List<source> getStringName(@Param("table,databse")String table,
                               String database);

}
