package com.mpp.aboneh;

public class Person {
    private String name;
    private String phone;
    private  int age;
    private String type ;

    public double getSalary(){
        return 0;
    }

    public int getTotalUnit(){
        return 0;
    }

    public void addCourse(Course course){
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getType(){ return  type; }

    public void setType(String type){
        this.type = type;
    }

    @Override
    public String toString(){

        return "[ Name: " + name + " Phone: " + phone + " Age: " + age + " Type: " + type + "]";
    }
}
