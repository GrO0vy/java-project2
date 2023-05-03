package com.likelion.javaproject2.codeUp;

import java.util.Scanner;

public class CodeUp1091 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int start = sc.nextInt();
        int mulNumber = sc.nextInt();
        int plusNumber = sc.nextInt();
        int num = sc.nextInt();

        long result = start;

        for (int i=1; i<num; i++){
            result = result * mulNumber + plusNumber;
        }

        System.out.println(result);
        sc.close();
    }
}
