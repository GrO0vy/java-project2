package com.likelion.javaproject2.week7.day1;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();

        if(checkLeapYear(year)) System.out.println(year + " O");
        else System.out.println(year + " X");
    }

    public static boolean checkLeapYear(int year){
        return  (year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0);
    }

    public static boolean isLeapYear(int year){
        if(year % 4 == 0) return true;
        return false;
    }
}

