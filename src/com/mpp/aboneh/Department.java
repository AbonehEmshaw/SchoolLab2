package com.mpp.aboneh;

import java.util.ArrayList;
import java.util.List;
import java.util.PrimitiveIterator;

public class Department {
    private String name;
    ArrayList<Person> person;

    public Department(String name) {
        this.name = name;
        person = new ArrayList<Person>();
    }

    public double getTotalSalary() {
        double totalSalary = 0;
        for (Person person : person)
            totalSalary += person.getSalary();
        return totalSalary;
    }

    public void showAllMembers() {
        System.out.println(person);
    }

    public void unitsPerFaculty() {

        for (Person p : person) {
            if (p instanceof Faculty) {
               // Faculty f = (Faculty) p;
                System.out.println(p.getName() + " " + p.getTotalUnit());
            }
        }
    }

    public void printOutAllGPAsForAllStudents(){
        for(Person p : person){
            if (p instanceof Student){
                Student s = (Student) p;
                System.out.println(s.getName() + " " + s.getGpa());
            }
        }
    }

    public void addPerson(Person newPerson) {
        person.add(newPerson);
    }
}
