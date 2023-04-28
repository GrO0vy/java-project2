package com.likelion.javaproject2.week2.day5;

public class SwitchCaseWrong {
    public static void main(String[] args) {
        int dayOfWeek = 1;

        switch (dayOfWeek) {
            case 1:
                System.out.println("월요일");
            case 2:
                System.out.println("화요일");
            case 3:
                System.out.println("수요일");
            default:
                System.out.println("X");
        }
    }
}
