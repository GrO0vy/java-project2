package com.likelion.javaproject2.week2.day3;

public class ReferenceTypeArray {
    public static void main(String[] args) {
        Student[] students = new Student[2];
        students[0] = new Student();
        students[0].name = "이민철";
        students[0].age = 25;
        students[0].phoneNumber = "010-2880-5432";
        students[1] = new Student();
        students[1].name = "김민철";
        students[1].age = 29;
        students[1].phoneNumber = "010-1234-5678";

        System.out.printf("students[0] : name = %s , age = %d , phoneNumber = %s\n",students[0].name,students[0].age,students[0].phoneNumber);
        System.out.printf("students[1] : name = %s , age = %d , phoneNumber = %s\n",students[1].name,students[1].age,students[1].phoneNumber);
    }
}
