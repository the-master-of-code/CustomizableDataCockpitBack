package com.ahpu.service;

import com.ahpu.pojo.budgetAndExpenses;

import java.util.List;

public interface beService {
    List<budgetAndExpenses> getBE(String type);
}
