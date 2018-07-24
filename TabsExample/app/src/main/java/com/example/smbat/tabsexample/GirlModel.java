package com.example.smbat.tabsexample;

public class GirlModel {

    private final int imageResId;
    private final String name;

    public GirlModel(int imageResId, String name) {
        this.imageResId = imageResId;
        this.name = name;
    }

    public int getImageResId() {
        return imageResId;
    }

    public String getName() {
        return name;
    }
}
