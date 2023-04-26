package com.likelion.javaproject2.week2.day3;

import com.likelion.javaproject2.PrintHello;

public class ReferenceTypeVariable {
    public static void main(String[] args) {
        Student student = new Student();
        Student[] students = new Student[30];

        Object obj = new Student();
        Object obj2 = new PrintHello();
    }
}
