package com.design.patterns.creational;

import java.util.ArrayList;

public class HardCandyPeppermint extends Candy {
    @Override
    ArrayList<Candy> makeCandyPackage(int quantity) {
        ArrayList hardCandyPackage = new ArrayList<>();
        for(int i = 1; i <= quantity; i++) {
            Candy hardCandy_Peppermint = new HardCandyPeppermint();
            hardCandyPackage.add(hardCandy_Peppermint);
        }

        System.out.println("One package of " + quantity + " peppermints has been made!");
        return hardCandyPackage;

    }
}
