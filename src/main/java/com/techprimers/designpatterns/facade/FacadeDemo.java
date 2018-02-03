package com.techprimers.designpatterns.facade;

public class FacadeDemo {

    public static void main(String[] args) {

        FacadePhone facadePhone = new FacadePhone();

        System.out.println(facadePhone.buildAndroidPhone());
        System.out.println(facadePhone.buildApplePhone());
        System.out.println(facadePhone.buildMicrosoftPhone());

    }
}
