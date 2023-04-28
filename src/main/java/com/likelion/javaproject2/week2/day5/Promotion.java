package com.likelion.javaproject2.week2.day5;

import java.util.Scanner;

public class Promotion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int yearExp = sc.nextInt();
        int projCnt = sc.nextInt();

        if(yearExp > 5 || projCnt > 10) System.out.println("팀장 승진 대상입니다.");
        else System.out.println("팀장 승진 대상이 아닙니다.");
    }
}
