package com.likelion.javaproject2.week6.day5;

// Rectangular 구현체
public class Rectangular implements Shape{
    private double width;
    private double height;

    public Rectangular(double width, double height){
        this.width = width;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return width * height;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * (width + height);
    }
}
