package com.ahpu.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class budgetAndExpenses {
    private int id;
    private int manage;
    private int sale;
    private int market;
    private int develop;
    private int service;
    private int conmunicate;
    private String type;
}
