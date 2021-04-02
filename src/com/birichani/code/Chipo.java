package com.birichani.code;

import java.math.BigDecimal;

public class Chipo extends Fries{
    public Chipo(String desc){
        description=desc;
    }

    @Override
    public BigDecimal price() {
        return new BigDecimal(70);
    }
}
