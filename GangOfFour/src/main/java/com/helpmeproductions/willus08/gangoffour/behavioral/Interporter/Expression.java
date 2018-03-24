package com.helpmeproductions.willus08.gangoffour.behavioral.Interporter;



public class Expression implements Interproter{
    String data;

    public Expression(String data) {
        this.data = data;
    }

    @Override
    public boolean interprit(String s) {
        if(s.contains(data)){
            return true;
        }
        return false;
    }
}
