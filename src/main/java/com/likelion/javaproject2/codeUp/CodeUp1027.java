package com.likelion.javaproject2.codeUp;

import java.util.Scanner;

public class CodeUp1027 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] date = sc.next().split("\\.");

        System.out.printf("%02d-%02d-%04d",Integer.parseInt(date[2]),Integer.parseInt(date[1]),Integer.parseInt(date[0]));
        sc.close();
    }

}
