package com.techprimers.designpatterns.composite;

public abstract class Employee {
    protected String name;
    protected Integer empId;
    protected Long salary;

    public Employee(String name, Integer empId, Long salary) {
        this.name = name;
        this.empId = empId;
        this.salary = salary;
    }

    public void add(Employee employee) {
        throw new UnsupportedOperationException("Cannot add reportee by default");
    }

    public void remove(Employee employee) {
        throw new UnsupportedOperationException("Cannot add reportee by default");
    }

    public abstract String toString();

}
