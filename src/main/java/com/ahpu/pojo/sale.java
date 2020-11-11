package com.ahpu.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class sale {
    private int id;
    private float sales;
    private String area;
    private int quarter;
}
