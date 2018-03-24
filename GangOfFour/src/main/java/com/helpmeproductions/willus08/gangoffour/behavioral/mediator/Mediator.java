package com.helpmeproductions.willus08.gangoffour.behavioral.mediator;


import java.util.Date;

public class Mediator {
    public static void showMessage(Person person, String msg){
        System.out.println(new Date().toString() + "{ " + person.getName() + "} :" + msg);
    }
}
