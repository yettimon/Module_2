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

public class Main {

    public static void main(String[] args) {
	int height = 3;
	double angle =4;
	int base = 6;

        Parallelogram painting = new Parallelogram(3,4,5,6);
        painting.setAngle(3);
        painting.setBase(4);
        painting.setHeight(6);

        System.out.println(painting.toString());
    }
}
