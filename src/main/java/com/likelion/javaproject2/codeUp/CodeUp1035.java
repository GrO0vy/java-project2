package com.likelion.javaproject2.codeUp;

import java.util.Scanner;

public class CodeUp1035 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String num = sc.next();
        int result = Integer.parseInt(num,16);

        System.out.printf("%o",result);
    }
}
