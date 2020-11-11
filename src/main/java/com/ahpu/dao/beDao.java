package com.ahpu.dao;

import com.ahpu.pojo.budgetAndExpenses;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface beDao {
    @Select("select * from budgetandexpenses where type=#{type}")
    List<budgetAndExpenses> getBE(@Param("type") String type);
}
