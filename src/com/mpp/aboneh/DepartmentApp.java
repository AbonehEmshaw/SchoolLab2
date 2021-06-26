package com.mpp.aboneh;

import java.io.*;
import java.io.IOException;

public class DepartmentApp {

    public static void main(String[] args) throws IOException {
	Department department = new Department("ComputerScience");

	// Creating faculty objects
        Person frankMoore = new Faculty("Frank Moore", "472-5921", 43, 10000, "Faculty");
        Person samHoward = new Faculty("Sam Howard","472-7222",55,9500, "Faculty");
        Person johnDoodle = new Faculty("John Doodle","472-6190",39,8600, "Faculty");

        department.addPerson(frankMoore);
        department.addPerson(samHoward);
        department.addPerson(johnDoodle);

    // Creating student objects
        Person johnDoe = new Student("John Doe","472-1121",22,4.0, "Student");
        Person maryJones = new Student("Mary Jones","472-7322",32,3.80, "Student");
        Person leeJohnson = new Student("Lee Johnson","472-6009",19,3.65, "Student");

        department.addPerson (johnDoe);
        department.addPerson(maryJones);
        department.addPerson(leeJohnson);

        // Creating staff objects
        Person frankGore = new Staff("Frank Gore","472-3321",33,4050, "Staff");
        Person adamDavis = new Staff("Adam Davis","472-7552",50,5500, "Staff");
        Person davidHeck = new Staff("David Heck","472-8890",29,3600, "Staff");

        department.addPerson (frankGore);
        department.addPerson(adamDavis);
        department.addPerson(davidHeck);

        // Create course objects

        Course cs201 = new Course("cs201","Programming 1",4);
        Course cs360 = new Course("cs360","Database",3);
        Course cs404 = new Course("cs404","Compiler",4);
        Course cs240 = new Course("cs240","Data Structure",2);
        Course cs301 = new Course("cs301","Software Engineering",3);
        Course cs450 = new Course("cs450","Advanced Architecture",5);


        johnDoodle.addCourse(cs201);
        samHoward.addCourse(cs360);
        johnDoodle.addCourse(cs404);
        johnDoodle.addCourse(cs240);
        samHoward.addCourse(cs301);
        frankMoore.addCourse(cs450);

        /********************************************************/


        double totalSalary = 0;

        while(true)
        {
            putText("Enter first letter of ");
            putText("getTotalSalary, showAllMembers, unitsPerFaculty or quit : ");
            int choice = getChar();
            switch(choice)
            {
                case 'g':
                    totalSalary = department.getTotalSalary();
                    putText("Total sum of all salaries is:");
                    putText(String.valueOf(totalSalary)+"\n");
                    break;
                case 's':
                    department.showAllMembers();
                    break;
                case 'u':
                    department.unitsPerFaculty();
                    break;
                case 'c':
                    department.printOutAllGPAsForAllStudents();
                    break;
                case 'q': return;
                default:
                    putText("Invalid entry\n");
            }
        }
    }

    public static void putText(String s) {
        System.out.println(s);
    }

    public static String getString() throws IOException {
        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        String string = bufferedReader.readLine();
        return string;
    }

    public static char getChar() throws IOException {
        String string = getString();
        return string.charAt(0);
    }


    public static int getInt() throws IOException {
        String string = getString();
        return Integer.parseInt(string);
    }
}

