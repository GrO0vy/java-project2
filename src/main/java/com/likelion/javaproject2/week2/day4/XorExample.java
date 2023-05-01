package com.likelion.javaproject2.week2.day4;

public class XorExample {
    public static void main(String[] args) {
        System.out.printf("true XNOR true --> %b\n", !(true ^ true));
        System.out.printf("true XNOR false --> %b\n", !(true ^ false));
        System.out.printf("false XNOR true --> %b\n", !(false ^ true));
        System.out.printf("false XNOR false --> %b\n", !(false ^ false));
    }
}
