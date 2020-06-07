/*
*
* Classame : BikeFrame
*
*  07 June 2020
*
* Copyright Stavnichuk Dmytro
*
*  Module 2 task 2 Inheritance
*
Inheritance
Create another class as a super class for your one.  Or create a daughterly class for your one.
* */
package com.company;

public class BikeFrame extends Parallelogram{

    String FrameColor;
    int FrameMaterial;
    boolean FrameAmortization;
    int FramePrice;

    public BikeFrame(int height, double angle, int base, int side, String frameColor, int frameMaterial, boolean frameAmortization, int framePrice) {
        super(height, angle, base, side);
        FrameColor = frameColor;
        FrameMaterial = frameMaterial;
        FrameAmortization = frameAmortization;
        FramePrice = framePrice;
    }

    public BikeFrame(String frameColor, int frameMaterial, boolean frameAmortization, int framePrice) { FrameColor = frameColor;
       FrameMaterial = frameMaterial;
       FrameAmortization = frameAmortization;
       FramePrice = framePrice;
    }

    public String getFrameColor() {
        return FrameColor;
    }

    public void setFrameColor(String frameColor) {
        this.FrameColor = frameColor;
    }

    public int getFrameMaterial() {
        return FrameMaterial;
    }

    public void setFrameMaterial(int frameMaterial) {
        FrameMaterial = frameMaterial;
    }

    public boolean isFrameAmortization() {
        return FrameAmortization;
    }

    public void setFrameAmortization(boolean frameAmortization) {
        FrameAmortization = frameAmortization;
    }

    public int getFramePrice() {
        return FramePrice;
    }

    public void setFramePrice(int framePrice) {
        FramePrice = framePrice;
    }

    public int getBikePrice() {
        return getFramePrice()*85;
    }

    @Override
    public String toString() {
        return "BikeFrame{" + "\n" +
                " FrameColor='" + FrameColor + '\'' + "\n" +
                " FrameMaterial='" + FrameMaterial + '\'' + "\n" +
                " FrameAmortization=" + FrameAmortization + "\n" +
                " FramePrice=" + FramePrice + "\n" +
                " FrameArea=" + super.getArea() + "\n" +
                " FrameHeight=" + super.getHeight() + "\n" +
                " FramePerimeter=" + super.getPerimeter() + "\n" +
                " BikePrice=" +getBikePrice() + "\n" +
                '}';
    }
}
