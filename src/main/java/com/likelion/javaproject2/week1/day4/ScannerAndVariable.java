package com.likelion.javaproject2.week1.day4;

import java.util.Scanner;

public class ScannerAndVariable {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int iVal1 = sc.nextInt();
        int iVal2 = sc.nextInt();

        System.out.println(iVal1 + iVal2);
        System.out.printf("%d + %d = %d",iVal1,iVal2,iVal1+iVal2);
//        System.out.println(sc.nextInt() + sc.nextInt());
    }
}
