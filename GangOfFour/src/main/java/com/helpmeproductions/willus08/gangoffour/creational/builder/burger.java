package com.helpmeproductions.willus08.gangoffour.creational.builder;

/**
 * Created by Willus08 on 3/24/2018.
 */

public class burger implements Item {
    @Override
    public String name() {
        return "Burger";
    }

    @Override
    public float price() {
        return 3.50f;
    }
}
