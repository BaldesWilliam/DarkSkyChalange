package com.helpmeproductions.willus08.gangoffour.structual.bridge;


public class UseClass extends AbClass {
    private String s;
    public UseClass(String s, Bridge bridge) {
        super(bridge);
        this.s = s;
    }

    @Override
    public void doSomethingSpecial() {
        bridge.doSomething(s);
    }
}
