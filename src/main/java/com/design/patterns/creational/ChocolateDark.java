package com.design.patterns.creational;

import java.util.ArrayList;

public class ChocolateDark extends Candy {
    @Override
    ArrayList<Candy> makeCandyPackage(int quantity) {
        ArrayList chocolatePackage = new ArrayList<>();
        for (int i = 1; i <= quantity; i++) {
            Candy chocolate = new ChocolateDark();
            chocolatePackage.add(chocolate);
        }

        System.out.println("One package of " + quantity + " dark chocolates has been made!");
        return chocolatePackage;

    }
}