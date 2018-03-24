package com.helpmeproductions.willus08.gangoffour.structual.facade;

import com.helpmeproductions.willus08.gangoffour.Obj1;
import com.helpmeproductions.willus08.gangoffour.Obj2;

public class Facade {
    private Object o1;
    private Object o2;

    public Facade() {
        o1 = new Obj1();
        o2 = new Obj2();
    }

    public void useObje(){
        o1.toString();
    }

    public void useobje2(){
        o2.toString();
    }
}
