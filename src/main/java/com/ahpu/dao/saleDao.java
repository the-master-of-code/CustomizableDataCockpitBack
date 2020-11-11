package com.ahpu.dao;

import com.ahpu.pojo.sale;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface saleDao {
    //根据季度查询交易额
    @Select("select * from sale where quarter=#{quarter}")
    List<sale>  allSale(@Param("quarter") int quarter);

    @Select("select * from sale")
    List<sale> allSale1();
}
