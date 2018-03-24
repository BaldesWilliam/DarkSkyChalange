package com.helpmeproductions.willus08.gangoffour.behavioral.visitor;


import com.helpmeproductions.willus08.gangoffour.Obj1;
import com.helpmeproductions.willus08.gangoffour.structual.adapter.Obj2;

public interface Visitor {
    void visit(Obj1 obj1);
    void visit(Obj2 obj2);
}
