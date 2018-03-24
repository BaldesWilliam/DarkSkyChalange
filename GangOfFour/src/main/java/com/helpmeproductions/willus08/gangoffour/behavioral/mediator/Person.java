package com.helpmeproductions.willus08.gangoffour.behavioral.mediator;

/**
 * Created by Willus08 on 3/24/2018.
 */

class Person {
    String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void SendMessage(String s){
        Mediator.showMessage(this,s);
    }
}
