package com.techprimers.designpatterns.decorator;

//Decorator
public abstract class SmartPhone implements Phone {

    private final Phone phone;

    public SmartPhone(Phone phone) {
        this.phone = phone;
    }

    public String build() {
        return phone.build();
    }
}
