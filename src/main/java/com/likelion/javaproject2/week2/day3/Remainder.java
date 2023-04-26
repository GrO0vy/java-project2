package com.likelion.javaproject2.week2.day3;

public class Remainder {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 3;

        int mod = num1 / num2;
        int remain = num1 % num2;

        System.out.printf("%d / %d 의 몫은 %d 이고 나머지는 %d 입니다.",num1 , num2 ,mod ,remain);
    }
}
