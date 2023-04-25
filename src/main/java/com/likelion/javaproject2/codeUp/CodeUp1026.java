package com.likelion.javaproject2.codeUp;

import java.util.Scanner;

public class CodeUp1026 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] time = sc.next().split(":");

        System.out.printf("%d",Integer.parseInt(time[1]));
        sc.close();
    }

}
