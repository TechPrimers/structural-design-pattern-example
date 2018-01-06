package com.techprimers.designpatterns.decorator;

public class ApplePhone extends SmartPhone {
    public ApplePhone(Phone phone) {
        super(phone);
    }

    @Override
    public String build() {
        return super.build() + addOS();
    }

    private String addOS() {
        return "IOS v1.0";
    }
}
