package com.techprimers.designpatterns.decorator;

public class DecoratorExample {

    public static void main(String[] args) {


        Phone androidPhone = new AndroidPhone(new BasicPhone());
        System.out.println(androidPhone.build());


        Phone applePhone = new ApplePhone(new BasicPhone());
        System.out.println(applePhone.build());


        Phone nokiaWindowsPhone = new NokiaPhone(new WindowsPhone(new BasicPhone()));
        System.out.println(nokiaWindowsPhone.build());

        Phone nokiaAndroidPhone = new NokiaPhone(new AndroidPhone(new BasicPhone()));
        System.out.println(nokiaAndroidPhone.build());

    }
}
