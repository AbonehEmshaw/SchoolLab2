package com.mpp.aboneh;

public class Staff extends Person{
    private double salary;
    Staff(String name, String phone, int age, double salary, String type) {
        super.setName(name);
        super.setPhone(phone);
        super.setAge(age);
        super.setType(type);
        this.salary = salary;
    }

    @Override
    public double getSalary() {
        return salary;
    }
}
