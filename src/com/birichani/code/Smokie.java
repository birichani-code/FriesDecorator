package com.birichani.code;
/**
 * @author birichani
 */
import java.math.BigDecimal;

public class Smokie extends FriesDecorator{
    Fries fries;
    public Smokie(Fries fries1){
        fries=fries1;
    }
    @Override
    public String getDescription() {
        return fries.getDescription()+" & Smokie".toUpperCase();
    }
    @Override
    public BigDecimal price() {
        return fries.price().add(new BigDecimal(30));
    }
}
