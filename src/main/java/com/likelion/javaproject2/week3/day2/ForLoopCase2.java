package com.likelion.javaproject2.week3.day2;

public class ForLoopCase2 {
    public static void main(String[] args) {

        // Math.sqrt()
        for(int i=0; i * i <= 50; i++){
            System.out.println(i);
        }

        System.out.println("=================================");

        for(int i=0; i <= Math.sqrt(50); i++){
            System.out.println(i);
        }
    }
}
