package com.birichani.code;

import java.math.BigDecimal;

public class FriesMain {
    public static void main(String[] args) {
        Fries myFries = new Chipo("CHIPO PLAIN ");
        System.out.printf("price of%s is KSH%.2f %n", myFries.getDescription(), myFries.price());
        myFries=new Smokie(myFries) ;
        System.out.printf("price of%s is KSH%.2f %n",myFries.getDescription(),myFries.price());



    }
}
