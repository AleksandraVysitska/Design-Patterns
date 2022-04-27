package com.design.patterns.creational;

import java.util.ArrayList;

public class HardCandyFactory extends CandyFactory {
    @Override
    public Candy getCandy(String type) {
        switch (type) {
            case "candycane":
                return new HardCandyCandyCane();
            case "lollipop":
                return new HardCandyLollipop();
            case "peppermint":
                return new HardCandyPeppermint();
            default:
                return new HardCandyCandyCane();
        }

    }

    @Override
    public ArrayList getCandyPackage(int quantity, String type) {
        Candy candy = getCandy(type);
        if(quantity % 10 != 0) {
            System.out.println("Hard candy must be packaged in multiples of 10.");
            return null;
        }
        ArrayList candyPackage = candy.makeCandyPackage(quantity);
        return candyPackage;
    }

}
