package com.likelion.javaproject2.week2.day4;

public class CheckWhetherAdult {
    public static void main(String[] args) {
        int userAge = 31;
        boolean isAdult = userAge >=18;
        System.out.println("미성년자 여부 : " + !isAdult);
    }
}
