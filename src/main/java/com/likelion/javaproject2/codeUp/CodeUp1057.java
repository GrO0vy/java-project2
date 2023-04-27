package com.likelion.javaproject2.codeUp;

import java.util.Scanner;

public class CodeUp1057 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean num1 = sc.nextInt() !=0;
        boolean num2 = sc.nextInt() !=0;

        if(num1 == num2) System.out.println(1);
        else System.out.println(0);
    }
}
