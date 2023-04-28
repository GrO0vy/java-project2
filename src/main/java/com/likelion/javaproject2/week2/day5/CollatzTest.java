package com.likelion.javaproject2.week2.day5;

import java.util.Scanner;

public class CollatzTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        Collatz collatz = new Collatz();
        System.out.printf("반복 횟수 : %d " ,collatz.solution(num));
    }
}
