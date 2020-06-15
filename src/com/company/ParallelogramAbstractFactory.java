/*
*
* Classame : ParallelogramAbstractFactory
*
*  14 June 2020
*  version 1.0
*
* Copyright Stavnichuk Dmytro
*
*  Module 2 task 4 Programming patterns. Factory, Builder
*
Develop for your class
1. Factory.
2. Abstract factory.
3. Create a class Student  - 25 fields.
4.  Create a builder for the class Student/
*
* My figure is Parallelogram
* */
package com.company;

public class ParallelogramAbstractFactory {
    //creation of AbstractFactory for Parallelogram and BikeFrame
    public static  IGeometry create(int height,
                                    double angle,
                                    int base,
                                    int side,
                                    String type){
        if (type.equals("Parallelogram")) return new Parallelogram(height,angle,base,side);
        if (type.equals("BikeFrame")) return new BikeFrame(height,angle,base,side);
        return null;
    }
}
