package com.helpmeproductions.willus08.gangoffour.creational.builder;

/**
 * Created by Willus08 on 3/24/2018.
 */

public class coke implements Item{
    @Override
    public String name() {
        return "coke";
    }

    @Override
    public float price() {
        return 1.2f;
    }
}
