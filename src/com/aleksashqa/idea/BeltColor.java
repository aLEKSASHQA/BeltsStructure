package com.aleksashqa.idea;

public enum BeltColor {
    WHITE    ("Белый пояс"),
    BLACK    ("Черный пояс");

    private String name;

    public String getName() {
        return name;
    }

    BeltColor(String name) {
        this.name = name;
    }


}
