package com.helpmeproductions.willus08.gangoffour.structual.composite;


import java.util.ArrayList;
import java.util.List;

public class Composite {
    private String s1;
    private String s2;
    private List<Composite> objects;

    public Composite(String s1, String s2) {
        this.s1 = s1;
        this.s2 = s2;
        objects = new ArrayList<>();
    }

    public void add(Composite c){
        objects.add(c);
    }

    public void remover(Composite c){
        objects.remove(c);
    }

    public List<Composite> getObjects(){
        return objects;
    }

    public String toString(){
        return ("Object: {S1: " + s1 +", S2: "+ s2 +"}");
    }
}
