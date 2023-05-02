package com.likelion.javaproject2.week3.day2;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int result =1;

        for(int i=1; i<=num; i++){
            result = result * i;
        }

        System.out.printf("%d! = %d",num,result);
    }
}
