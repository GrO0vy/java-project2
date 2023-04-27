package com.likelion.javaproject2.week2.day4;

public class OrExample1 {
    public static void main(String[] args) {
        boolean result = true || true;
        System.out.println(result);
        result = true || false;
        System.out.println(result);
        result = false || true;
        System.out.println(result);
        result = false || false;
        System.out.println(result);
    }
}
