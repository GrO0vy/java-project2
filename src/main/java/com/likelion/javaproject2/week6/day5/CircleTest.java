package com.likelion.javaproject2.week6.day5;

// Main 클래스
public class CircleTest {
    public static void main(String[] args) {
        Shape circle = new Circle(8);

        System.out.println(circle.calculateArea());
        circle.display();
    }
}
