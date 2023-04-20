package com.likelion.javaproject2.week1.day4;

import com.likelion.javaproject2.PrintHello;

public class VariableEx {
    public static void main(String[] args) {
        PrintHello printHello; // 변수 선언
        int iVal; // 변수 선언

        printHello = new PrintHello(); // 초기화
        iVal = 10; // 초기화

        printHello.print();
        System.out.println(iVal);
    }
}
