package com.likelion.javaproject2.codeUp;

import java.util.Scanner;

public class CodeUp1085 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long hertz = sc.nextInt();
        long bits = sc.nextInt();
        long channels = sc.nextInt();
        long time = sc.nextInt();

        float result = hertz * bits * channels * time;
        result = result / 8 / 1024 / 1024;

        System.out.printf("%.1f MB",result);
    }
}
