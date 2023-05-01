package com.likelion.javaproject2.codeUp;

import java.util.Scanner;

public class CodeUp1079 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        for(char c='a'; c != 'q';){
            c = sc.next().charAt(0);
            System.out.println(c);
        }
    }
}
