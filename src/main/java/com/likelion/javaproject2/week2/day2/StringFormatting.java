package com.likelion.javaproject2.week2.day2;

public class StringFormatting {
    public static void main(String[] args) {
        String name = "이민철";
        int balance = 10000;

        String result = String.format("%s 님의 통장잔고는 %d원 입니다.",name,balance);
        System.out.println(result);
    }
}
