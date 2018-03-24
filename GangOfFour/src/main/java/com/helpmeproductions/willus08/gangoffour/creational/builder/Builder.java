package com.helpmeproductions.willus08.gangoffour.creational.builder;


public class Builder {

    public Group prepGroup(){
        Group group = new Group();
        group.addItem(new burger());
        group.addItem(new coke());
        return group;
    }
}
