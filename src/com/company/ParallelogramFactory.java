/*
*
* Classame : ParallelogramFactory
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
* */
package com.company;

public class ParallelogramFactory {
    public static Parallelogram create(int id, int height, int base, int side){

        Parallelogram parallelogram= new Parallelogram(id,height,base,side);
        return parallelogram;
    }
}
