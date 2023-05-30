package com.likelion.javaproject2.week7.day1;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        checkLeapYear(year);
    }

    private static void checkLeapYear(int year){
        if( (year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0) ) System.out.printf("%d O\n", year);
        else System.out.printf("%d X\n", year);
    }

}

