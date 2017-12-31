package com.techprimers.designpatterns.composite;

public class Developer extends Employee {
    public Developer(String name, Integer empId, Long salary) {
        super(name, empId, salary);
    }

    @Override
    public String toString() {

        StringBuilder builder = new StringBuilder("Developer: ");
        builder.append(name);
        builder.append(",");
        builder.append(empId);

        return builder.toString();
    }
}
