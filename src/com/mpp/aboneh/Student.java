package com.mpp.aboneh;

import java.util.ArrayList;
import java.util.List;

public class Student extends Person{
    private double gpa;
    List<Course> courseList;

    Student(String name, String phone, int age, double gpa, String type){
        super.setName(name);
        super.setPhone(phone);
        super.setAge(age);
        super.setType(type);
        this.gpa = gpa;
        courseList = new ArrayList<Course>();
    }

    public void addCourse(Course course){
        courseList.add(course);
    }

    public void getTotalUnits(){
    }

    public double getGpa(){
        return  gpa;
    }
    List<Course> getCoursesTaken(){
        return courseList;
    }
}
