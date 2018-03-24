package com.helpmeproductions.willus08.gangoffour.structual.bridge;


public abstract class AbClass {
    protected Bridge bridge;

    public AbClass(Bridge bridge) {
        this.bridge = bridge;
    }
    public abstract void doSomethingSpecial();
}
