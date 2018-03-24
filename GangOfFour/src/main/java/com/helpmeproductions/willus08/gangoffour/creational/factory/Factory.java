package com.helpmeproductions.willus08.gangoffour.creational.factory;


import com.helpmeproductions.willus08.gangoffour.Obj1;

public class Factory {
    public Object getObject(String type){
        if(type == null){
            return null;
        }else if(type.equalsIgnoreCase("obj1")){
            return new Obj1();
        }else {
            return null;
        }
    }

}
