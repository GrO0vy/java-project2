package com.likelion.javaproject2.codeUp;

import java.util.Scanner;

public class CodeUp1046 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long num1 = sc.nextLong();
        long num2 = sc.nextLong();
        long num3 = sc.nextLong();

        System.out.println(num1+num2+num3);
        System.out.printf("%.1f",(num1+num2+num3)/3.0);
    }
}
