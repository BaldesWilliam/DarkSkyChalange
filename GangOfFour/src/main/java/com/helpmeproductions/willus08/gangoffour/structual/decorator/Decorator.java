package com.helpmeproductions.willus08.gangoffour.structual.decorator;


import com.helpmeproductions.willus08.gangoffour.Object2;

public abstract class Decorator {
    protected Object2 o2;

    public Decorator(Object2 o2) {
        this.o2 = o2;
    }

    public void doSomethingAwesome(){
        o2.doSomething("hi");
    }
}
