package com.helpmeproductions.willus08.gangoffour.creational.prototype;



public abstract class Clonable implements Cloneable {
    private String id;
    protected String type;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
