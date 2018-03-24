package com.helpmeproductions.willus08.gangoffour.creational.prototype;


import java.util.Hashtable;

public class Prototype {

    private static Hashtable<String, Clonable> cloneMap  = new Hashtable<String, Clonable>();
    public static Cloneable getClonable(String id){
        Cloneable chachedClone = cloneMap.get(id);
        return (Cloneable) chachedClone;
    }
}
