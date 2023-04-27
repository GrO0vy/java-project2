package com.likelion.javaproject2.codeUp;

import java.util.Scanner;

public class CodeUp1058 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean val1 = sc.nextInt() != 0;
        boolean val2 = sc.nextInt() != 0;

        if(!val1 && !val2) System.out.println(1);
        else System.out.println(0);
    }
}
