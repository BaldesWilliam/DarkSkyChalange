package com.helpmeproductions.willus08.gangoffour;

import com.helpmeproductions.willus08.gangoffour.behavioral.visitor.Visitor;
import com.helpmeproductions.willus08.gangoffour.behavioral.visitor.VisitorAceptor;
import com.helpmeproductions.willus08.gangoffour.structual.bridge.Bridge;

public class Obj1 implements Bridge,VisitorAceptor{
    @Override
    public void doSomething(String s) {
        System.out.println(s);
    }

    @Override
    public void accept(Visitor visitor) {

    }
}
