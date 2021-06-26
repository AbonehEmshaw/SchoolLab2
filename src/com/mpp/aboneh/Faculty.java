package com.mpp.aboneh;

import java.util.ArrayList;
import java.util.List;

public class Faculty extends Person{
    private double salary;
    List<Course> courseList;
    List<Person> personList;
    Faculty (String name, String phone, int age, double salary, String type){
        super.setName(name);
        super.setPhone(phone);
        super.setAge(age);
        super.setType(type);
        this.salary = salary;

        personList = new ArrayList<Person>();
        courseList = new ArrayList<Course>();
    }

    List<Course> getCourseList(){
        return  courseList;
    }

    public void  addCourse(Course course){
        courseList.add(course);
    }

    @Override
    public double getSalary(){
        return salary;
    }

    @Override
    public int getTotalUnit(){
        int totalUnit = 0;
        for(Course course : courseList)
            totalUnit += course.getUnits();
        return totalUnit;
    }
}
