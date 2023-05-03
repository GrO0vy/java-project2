package com.likelion.javaproject2.codeUp;

import java.util.Scanner;

public class CodeUp1092 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int player1 = sc.nextInt();
        int player2 = sc.nextInt();
        int player3 = sc.nextInt();

        int day = 1;

        while(day % player1 !=0 || day % player2 != 0 || day % player3 != 0) day++;
        System.out.println(day);
    }
}
