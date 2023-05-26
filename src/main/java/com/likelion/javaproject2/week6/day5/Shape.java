package com.likelion.javaproject2.week6.day5;

// Shape 인터페이스
public interface Shape {
    abstract double calculateArea();

    default void display(){
        System.out.println(calculateArea());
    }

}
