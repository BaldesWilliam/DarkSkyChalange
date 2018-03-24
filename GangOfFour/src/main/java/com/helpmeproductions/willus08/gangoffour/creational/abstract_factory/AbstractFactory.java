package com.helpmeproductions.willus08.gangoffour.creational.abstract_factory;


import com.helpmeproductions.willus08.gangoffour.Obj1;
import com.helpmeproductions.willus08.gangoffour.Obj2;

// Favtory of Factories
public abstract class AbstractFactory {
    abstract Obj1 getObject1(String s);
    abstract Obj2 getObject2(String s);
}
