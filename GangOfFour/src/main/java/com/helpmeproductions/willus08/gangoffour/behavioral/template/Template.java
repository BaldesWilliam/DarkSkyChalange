package com.helpmeproductions.willus08.gangoffour.behavioral.template;



public abstract class Template {
    abstract void initialize();
    abstract void start();
    abstract void end();

    public final void play(){
        initialize();

        start();

        end();
    }
}
