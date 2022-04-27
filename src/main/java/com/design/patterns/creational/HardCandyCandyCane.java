package com.design.patterns.creational;

import java.util.ArrayList;

public class HardCandyCandyCane extends Candy {
    @Override
    ArrayList<Candy> makeCandyPackage(int quantity) {

        ArrayList hardCandyPackage = new ArrayList<>();

        for(int i = 1; i <= quantity; i++) {
            Candy candyCane = new HardCandyCandyCane();
            hardCandyPackage.add(candyCane);
        }

        System.out.println(quantity / 10 + " packages of 10 candy canes have been made!");
        return hardCandyPackage;

    }

}
