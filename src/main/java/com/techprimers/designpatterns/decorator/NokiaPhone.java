package com.techprimers.designpatterns.decorator;

public class NokiaPhone extends SmartPhone {
    public NokiaPhone(Phone phone) {
        super(phone);
    }

    public String build() {
        return super.build() + addBranding();
    }

    private String addBranding() {
        return " Microsoft Phone";
    }
}
