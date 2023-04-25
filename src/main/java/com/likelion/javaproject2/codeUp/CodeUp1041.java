package com.likelion.javaproject2.codeUp;

import java.util.Scanner;

public class CodeUp1041 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char letter = sc.next().charAt(0);
        int result =  letter + 1;
        System.out.println((char)result);
    }
}
