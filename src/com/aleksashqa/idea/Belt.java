package com.aleksashqa.idea;

import java.util.ArrayList;

public class Belt {
    private String name;
    private BeltColor color;
    private static final ArrayList<Kata> katas = new ArrayList<Kata>();;

    public void setColor(BeltColor color) {
        this.color = color;
    }

    Belt(BeltColor color) {
//        ArrayList<Kata> katas;
        setColor(color);
        switch (this.color) {
            case WHITE:
                katas.add(Kata.REI);
                katas.add(Kata.TACHI_REI);
                katas.add(Kata.OBI);
                break;
            case BLACK:
//                katas.add(K);
            default:
                break;
        }
    }

    public void outputStructure() {
        System.out.println("Belt Color is " + this.color.getName());

        for (Kata kata : katas) {
            System.out.println( (kata.getType() == (KataType.HEADER) ? "\033[31m" : "\033[37m") + kata.getName()) ;
            System.out.println(kata.getDescription());
        }

    }
}
