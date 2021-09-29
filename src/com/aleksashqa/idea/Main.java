package com.aleksashqa.idea;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<BeltColor, Belt> belts = new HashMap<BeltColor, Belt>();

        for (BeltColor color : BeltColor.values()) {
            System.out.println(color);
            belts.put(color, new Belt(color));
        }

        belts.get(BeltColor.WHITE).outputStructure();
    }
}