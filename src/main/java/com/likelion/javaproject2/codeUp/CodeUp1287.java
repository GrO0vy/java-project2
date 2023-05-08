package com.likelion.javaproject2.codeUp;

import java.util.Scanner;

public class CodeUp1287 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int dan = sc.nextInt();

        for(int i=1; i<10; i++){
            for(int j = 1; j <= dan * i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
