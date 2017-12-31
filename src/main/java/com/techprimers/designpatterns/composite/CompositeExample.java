package com.techprimers.designpatterns.composite;

public class CompositeExample {

    public static void main(String[] args) {

        Employee developer1 = new Developer("Peter", 1, 100L);
        Employee developer2 = new Developer("Sam", 2, 200L);
        Employee developer3 = new Developer("Ryan", 3, 200L);
        Employee developer4 = new Developer("Ryan V", 6, 200L);
        Employee developer5 = new Developer("Ryan X", 7, 200L);
        Employee lead1 = new Lead("Mike", 4, 2000L);
        Employee lead2 = new Lead("Chris", 5, 2000L);
        Employee manager = new Manager("Will", 8, 50000L);



        lead1.add(developer1);
        lead1.add(developer2);
        lead1.add(developer3);

        System.out.println(lead1.toString());
        lead2.add(developer4);
        System.out.println(lead2.toString());

        manager.add(lead1);
        manager.add(lead2);
        manager.add(developer5);


        System.out.println(manager.toString());


    }
}
