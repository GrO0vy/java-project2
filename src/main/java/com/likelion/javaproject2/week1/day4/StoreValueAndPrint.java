package com.likelion.javaproject2.week1.day4;

import java.util.Scanner;

public class StoreValueAndPrint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int iVal1 = sc.nextInt();
        int iVal2 = sc.nextInt();

        System.out.printf("%d 와 %d 의 합은 %d 입니다.",iVal1,iVal2,iVal1+iVal2);
    }
}
