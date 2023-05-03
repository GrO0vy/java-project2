package com.likelion.javaproject2.week3.day3;

import java.util.Scanner;

public class SumDivisorTest {
    public static void main(String[] args) {
        SumDivisor sumDivisor = new SumDivisor();

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        System.out.printf("%d의 약수의 합 : %d",num,sumDivisor.solution(num));
    }
}
