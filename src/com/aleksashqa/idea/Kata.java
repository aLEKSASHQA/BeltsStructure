package com.aleksashqa.idea;

import java.awt.*;

public enum Kata {
    REI("Rei", "Приветствие (Поклон)", KataType.HEADER),
    TACHI_REI("Tachi-rei", "Приветствие стоя"),
    OBI("OBI", "Пояс (Завязывание)", KataType.HEADER);

    private String name;
    private String description;
    private Image image;
    private KataType type = KataType.MOVE;

    Kata(String name, String description, KataType type) {
        setName(name);
        setDescription(description);
        setType(type);
    }

    Kata(String name, String description) {
        setName(name);
        setDescription(description);
    }

    public KataType getType() {
        return type;
    }

    public void setType(KataType type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Image getImage() {
        return image;
    }

    public void setImage(Image image) {
        this.image = image;
    }
}

