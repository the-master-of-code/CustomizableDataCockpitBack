package com.ahpu.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class expenditure {
    private int id;
    private float cost;
    private float wage;
    private float rental;
    private int quarter;
}
