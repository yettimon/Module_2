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
    // privates
    private String frameColor;
    private int frameMaterial;
    private boolean frameAmortization;
    private int framePrice;

    public BikeFrame(int height,
                     double angle,
                     int base,
                     int side,
                     String frameColor,
                     int frameMaterial,
                     boolean frameAmortization,
                     int framePrice) {
        super(height, angle, base, side);
        this.frameColor = frameColor;
        this.frameMaterial = frameMaterial;
        this.frameAmortization = frameAmortization;
        this.framePrice = framePrice;
    }

    public BikeFrame(String frameColor, int frameMaterial, boolean frameAmortization, int framePrice) {
        this.frameColor = frameColor;
        this.frameMaterial = frameMaterial;
        this.frameAmortization = frameAmortization;
        this.framePrice = framePrice;
    }

    public BikeFrame(int height, double angle, int base, int side) {
    }

    public String getFrameColor() {
        return frameColor;
    }

    public void setFrameColor(String frameColor) {
        this.frameColor = frameColor;
    }

    public int getFrameMaterial() {
        return frameMaterial;
    }

    public void setFrameMaterial(int frameMaterial) {
        this.frameMaterial = frameMaterial;
    }

    public boolean isFrameAmortization() {
        return frameAmortization;
    }

    public void setFrameAmortization(boolean frameAmortization) {
        this.frameAmortization = frameAmortization;
    }

    public int getFramePrice() {
        return framePrice;
    }

    public void setFramePrice(int framePrice) {
        this.framePrice = framePrice;
    }

    public int getBikePrice() {
        return getFramePrice()*85;
    }

    @Override
    public String toString() {
        return "BikeFrame{" + "\n" +
                " FrameColor='" + frameColor + '\'' + "\n" +
                " FrameMaterial='" + frameMaterial + '\'' + "\n" +
                " FrameAmortization=" + frameAmortization + "\n" +
                " FramePrice=" + framePrice + "\n" +
                " FrameArea=" + super.getArea() + "\n" +
                " FrameHeight=" + super.getHeight() + "\n" +
                " FramePerimeter=" + super.getPerimeter() + "\n" +
                " BikePrice=" +getBikePrice() + "\n" +
                '}';
    }
}
