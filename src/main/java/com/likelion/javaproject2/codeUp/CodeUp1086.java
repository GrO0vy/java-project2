package com.likelion.javaproject2.codeUp;

import java.util.Scanner;

public class CodeUp1086 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long width = sc.nextInt();
        long height = sc.nextInt();
        long bits = sc.nextInt();

        float result = width * bits * height;
        result = result / 8 / 1024 / 1024;

        System.out.printf("%.2f MB",result);
    }
}
