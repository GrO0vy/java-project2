package com.likelion.javaproject2.week1.day5;

import com.likelion.javaproject2.PrintHello;

public class ConstantEx {
    public final int MAX_VALUE = 2;
    public static final int MIN_VALUE = 1;
    public static void main(String[] args) {
        final  int iVal;
        iVal = 1;
        System.out.println(iVal);

        System.out.println(MIN_VALUE);
        //iVal=2;

        final PrintHello printHello = new PrintHello();
    }
}
