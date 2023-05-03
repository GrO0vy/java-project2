package com.likelion.javaproject2.codeUp;

import java.util.Scanner;

public class CodeUp1095 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int count = sc.nextInt();
        sc.nextLine();
        String[] numbers = sc.nextLine().split(" ");

        int min = 24;

        for(int i=0; i<numbers.length; i++){
            int number = Integer.parseInt(numbers[i]);

            if(min > number ) min = number;
        }
        System.out.println(min);
    }
}
