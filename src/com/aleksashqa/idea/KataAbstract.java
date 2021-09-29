package com.aleksashqa.idea;

import java.awt.*;

abstract class KataAbstract{
    private String name;
    private String description;
    private Image image;
    private KataType type = KataType.MOVE;

    KataAbstract(String name, String description, KataType type) {
        setName(name);
        setDescription(description);
        setType(type);
    }

    KataAbstract(String name, String description) {
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
