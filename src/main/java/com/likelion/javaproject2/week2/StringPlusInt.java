package com.likelion.javaproject2.week2;

public class StringPlusInt {
    public static void main(String[] args) {
//        int result1 = "1"+1; -> 에러
        String result2 = "1"+1;
        System.out.println(result2);
        System.out.println(1+"1");

        int iResult = 1 + Integer.parseInt("1");
        System.out.println(iResult);
    }
}
