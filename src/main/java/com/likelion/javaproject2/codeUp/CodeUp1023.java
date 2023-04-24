package com.likelion.javaproject2.codeUp;

import java.util.Scanner;

public class CodeUp1023 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] val = new String[2];

        val = sc.next().split("\\.");

        System.out.printf("%d\n",Integer.parseInt(val[0]));
        System.out.printf("%d",Integer.parseInt(val[1]));

    }
}
