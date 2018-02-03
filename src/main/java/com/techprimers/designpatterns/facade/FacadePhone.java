package com.techprimers.designpatterns.facade;

public class FacadePhone {

    private IPhone iPhone;
    private NokiaPhone nokiaPhone;
    private OnePlus onePlus;

    public FacadePhone() {
        iPhone = new IPhone();
        nokiaPhone = new NokiaPhone();
        onePlus = new OnePlus();
    }

    public String buildApplePhone() {
        return iPhone.build();
    }

    public String buildMicrosoftPhone() {
        return nokiaPhone.build();
    }

    public String buildAndroidPhone() {
        return onePlus.build();
    }

}
