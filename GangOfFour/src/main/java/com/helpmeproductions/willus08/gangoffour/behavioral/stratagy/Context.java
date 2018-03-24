package com.helpmeproductions.willus08.gangoffour.behavioral.stratagy;

public class Context {
    private Strratagy strratagy;

    public Context(Strratagy strratagy) {
        this.strratagy = strratagy;
    }


    public int executeStrategy(int num1, int num2){
        return strratagy.doOperation(num1, num2);
    }
}
