package com.likelion.javaproject2.codeUp;

import java.util.Scanner;

public class CodeUp1094 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int count = sc.nextInt();
        sc.nextLine();
        String[] numbers = sc.nextLine().split(" ");

        for(int i=numbers.length-1; i>=0; i--){
            System.out.print(numbers[i]+" ");
        }


    }
}
