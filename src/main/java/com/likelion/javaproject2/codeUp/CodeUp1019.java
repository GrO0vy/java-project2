package com.likelion.javaproject2.codeUp;

import java.util.Scanner;

public class CodeUp1019 {
    public static void main(String[] args) {
        String[] date = new String[3];
        Scanner sc = new Scanner(System.in);
        date = sc.nextLine().split("\\.");

        System.out.printf("%04d.%02d.%02d",Integer.parseInt(date[0]),Integer.parseInt(date[1]),Integer.parseInt(date[2]));

        sc.close();

    }
}

