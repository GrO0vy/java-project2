package com.likelion.javaproject2.week6.day5;


// Circle 구현체
public class Circle implements Shape{
    private double radius;

    public Circle(double radius){
        this.radius = radius;
    }

    @Override
    public double calculateArea(){
        return radius * radius * Math.PI;
    }

    @Override
    public double calculatePerimeter(){
        return 2 * Math.PI * radius;
    }
}
