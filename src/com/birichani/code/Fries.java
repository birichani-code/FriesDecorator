package com.birichani.code;

import java.math.BigDecimal;

public abstract class Fries {
    protected String description="FRIES";

    public String getDescription() {
        return description;
    }

    public abstract BigDecimal price();
}
