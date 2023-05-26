package com.likelion.javaproject2.week6.day5;

// Shape 인터페이스
public interface Shape {
    abstract double calculateArea();
    abstract double calculatePerimeter();

    default void display(){
        System.out.println("넓이 : " + calculateArea());
        System.out.println("둘레 : " + calculatePerimeter());
    }

}
