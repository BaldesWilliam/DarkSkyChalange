package com.helpmeproductions.willus08.gangoffour.structual.adapter;


import com.helpmeproductions.willus08.gangoffour.Object1;
import com.helpmeproductions.willus08.gangoffour.Object2;

public class Adapter implements Object1 {
    // this is a place holder for any specific type of object you may want to use
    private Object2 o2;


    public Adapter(String s) {
        // this will look at a string and then use its case to see if this is an object2
        // if it is then it will adapt to using obj2
        if(s.equalsIgnoreCase("o2o")){
            o2 = new Obj2();
        }
    }

    @Override
    public void doSomething(String s) {
        if(s.equalsIgnoreCase("o2o")){
           o2.doSomething(s);
        }
    }
}
