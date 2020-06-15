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

    private String FrameColor;
    private int FrameMaterial;
    private boolean FrameAmortization;
    private int FramePrice;

    public BikeFrame(int height, double angle, int base, int side, String frameColor, int frameMaterial, boolean frameAmortization, int framePrice) {
        super(height, angle, base, side);
        this.FrameColor = frameColor;
        this.FrameMaterial = frameMaterial;
        this.FrameAmortization = frameAmortization;
        this.FramePrice = framePrice;
    }

    public BikeFrame(String frameColor, int frameMaterial, boolean frameAmortization, int framePrice) {
        this.FrameColor = frameColor;
        this.FrameMaterial = frameMaterial;
        this.FrameAmortization = frameAmortization;
        this.FramePrice = framePrice;
    }

    public BikeFrame(int height, double angle, int base, int side) {
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
        this.FrameMaterial = frameMaterial;
    }

    public boolean isFrameAmortization() {
        return FrameAmortization;
    }

    public void setFrameAmortization(boolean frameAmortization) {
        this.FrameAmortization = frameAmortization;
    }

    public int getFramePrice() {
        return FramePrice;
    }

    public void setFramePrice(int framePrice) {
        this.FramePrice = framePrice;
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
