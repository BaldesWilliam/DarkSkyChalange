package com.helpmeproductions.willus08.gangoffour.structual.proxy;


import com.helpmeproductions.willus08.gangoffour.Object1;

public class Proxy implements Object1 {

    private Real real;
    private String name;

    public Proxy(String name) {
        this.name = name;
    }

    @Override
    public void doSomething(String s) {
        if (real == null){
            real = new Real();
        }
        real.doSomething(s);
    }
}
