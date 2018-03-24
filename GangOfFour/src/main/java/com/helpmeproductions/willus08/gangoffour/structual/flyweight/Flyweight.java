package com.helpmeproductions.willus08.gangoffour.structual.flyweight;

import java.util.HashMap;

public class Flyweight {
    private static final HashMap objectMap = new HashMap();

    public static Object getObject(String type){
        Object o = objectMap.get(type);
        if(o == null){
            o = new Object();
            objectMap.put(type,o);

        }
        return o;
    }
}
