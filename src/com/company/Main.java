/*
*
* Classame : Main
*
*  07 June 2020
*
* Copyright Stavnichuk Dmytro
*
*  Module 2 task 1
*
* Create a class from the attached document according to the order in your group .  The class must contain
1. Constructor.
2  Getters/Setters.
3. 5 methods.
4. Override toString() method
5. Override hash() and equals() methods.
*
* */
package com.company;

import java.awt.*;
import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        //creation parallelogram withoud interfaces
	int height = 3;
	double angle =4;
	int base = 6;

        Parallelogram painting = new Parallelogram(3,
                4,
                5,
                6);
        painting.setAngle(3);
        painting.setBase(4);
        painting.setHeight(6);

        System.out.println(painting.toString());
        System.out.println(painting.hashCode());
        // JSON code
        System.out.println("To JSON " + painting.toJSON());
        // XML code
        System.out.println("To XML " + painting.toXML() + "\n");
        // Console view
        System.out.println("To Console "+ painting.toConsole());

        //Bike Frame extend class

        BikeFrame Bike = new BikeFrame("red",2,false,2);
        Bike.setHeight(5);
        System.out.println(Bike);

        //ParallelogramFactory creation of parallelogram with factory pattern
        Parallelogram parallelogram1 = ParallelogramFactory.create(3,4,6,8);
        System.out.println("Creating parallelogram using ParallelogramFactory "+ parallelogram1);

        //ParallelogramAbstractFactory

        // builder for class student
        Student Ivan = new Student.Builder()
                .setFirstName("Dmitriy")
                .setLastName("Stavnichuk")
                .setPatronymic("Oleksandrovich")
                .setStudLogin("Dimasta")
                .setStudPassword("Dima132")
                .setBirthday(LocalDate.of(1998,8,12))
                .setPhoneNumber("3809231231")
                .setRecordBook("123123A")
                .setDepartmentName("IFTKN")
                .setSpeciality("Computer Science")
                .setCourseNum(5)
                .setGroupNum(543)
                .setIsMilitary(false)
                .setBachelor(true)
                .setMagician(false)
                .setHasGrant(false)
                .setAvgMark(4)
                .setHadRetake(false)
                .setBudgetBasis("Budget")
                .build();
        System.out.println(Ivan);

    }
}
