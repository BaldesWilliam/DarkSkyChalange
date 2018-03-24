package com.helpmeproductions.willus08.gangoffour.structual.decorator;

import com.helpmeproductions.willus08.gangoffour.Object2;

public class AwesomeObject extends Decorator {

    public AwesomeObject(Object2 o2) {
        super(o2);
    }

    @Override
    public void doSomethingAwesome() {
        super.doSomethingAwesome();
        setColor(o2);
    }

    private void setColor(Object2 o2){
        System.out.println("Color set");
    }
}
