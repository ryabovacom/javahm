package com.otus.javahm;

public class Duck extends Animal implements Flying {
    public void say(){
        System.out.println("Кря");
    }

    public void fly() {
        System.out.println("Я лечу");
    }

}
