package com.ahpu.dao;

import com.ahpu.pojo.expenditure;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface exDao {
    @Select("select * from expenditure")
    List<expenditure> getEx();
}
