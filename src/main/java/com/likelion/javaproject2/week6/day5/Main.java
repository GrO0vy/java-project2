package com.likelion.javaproject2.week6.day5;

// 메인 클래스
public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle(5);
        Shape rectangular = new Rectangular(5, 10);

        circle.display();
        rectangular.display();
    }
}
