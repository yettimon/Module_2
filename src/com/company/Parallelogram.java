/*
*
* Classame : Parallelogram
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
*
* My figure is Parallelogram
*
* */
package com.company;

import java.util.Objects;

public class Parallelogram implements IGeometry, IPackaging{

    private int height;
    private double angle;
    private int base; // основа
    private int side; // бічна

    // Constructor

    public Parallelogram(int height, double angle, int base, int side) {
        this.height = height;
        this.angle = angle;
        this.base = base;
        this.side = side;
    }

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }

    // Constructor empty
    public Parallelogram() {
    }

    //Getters and Setters

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public double getAngle() {
        return angle;
    }

    public void setAngle(double angle) {
        this.angle = angle;
    }


    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }
    // Area method
    public int getArea(){
        return this.getHeight() * this.getBase();
    }
    // is ring ? method
    public boolean isRing(){
        return false;
    }
    // is square ? method
    public boolean isSquare(){
        return (this.getArea() == 45) ? true : false;
    }

    // Perimeter method
    public int getPerimeter()
    {
        return  2 * (getSide() * getBase());
    }
    // Diagonal Length method
    public double getFirstDiagonalLength(){

        return Math.sqrt(Math.pow(getSide(), 2) + Math.pow(getBase(), 2) +
                2 * (getBase()*getSide()) * Math.cos(getAngle()));
    }

    public double getSecondDiagonalLength(){

        return Math.sqrt(Math.pow(getSide(), 2) + Math.pow(getBase(), 2) -
                2 * (getBase()*getSide()) * Math.cos(getAngle()));
    }

    @Override
    public String toString() {
        return "Parallelogram{" + "\n" +
                " height=" + height + "\n" +
                " angle=" + angle + "\n" +
                " base=" + base + "\n" +
                " Area=" + getArea() + "\n" +
                " FirstDiagonalLength=" + getFirstDiagonalLength() + "\n" +
                " SecondDiagonalLength=" + getSecondDiagonalLength() + "\n" +
                " isRing=" + isRing() + "\n" +
                " isSquare=" + isSquare() + "\n" +
                " Perimeter=" + getPerimeter() + "\n" +
                 '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Parallelogram that = (Parallelogram) o;
        return getHeight() == that.getHeight() &&
                getBase() == that.getBase();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getHeight(), getBase());
    }
    // Interface realization
    @Override
    public String toJSON() {
        String json = "Parallelogram{"
                + "\""  + "Area\":" + this.getArea()
                + ","
                + "\""  + "Perimeter\":" + this.getPerimeter()
                + "}";
        return json;
    }

    @Override
    public String toXML() {
        String xml = "<Parallelogram>"
                + "<area>" + this.getArea() + "<area>"
                + "<perimeter>" + this.getPerimeter() + "<perimeter>"
                +  "</Parallelogram>";

        return xml;
    }
    // adding console view
    @Override
    public String toConsole() {
    String console = "Parameters of Parallelogram" + "\n"
            + "Area = " + this.getArea() + "\n"
            + "Perimeter = " + this.getPerimeter() + "\n";

        return console;
    }
}
