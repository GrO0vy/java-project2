package com.likelion.javaproject2.codeUp;

import java.util.Scanner;

public class CodeUp1093 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int count = sc.nextInt();

        int[] students = new int[23];

        for(int i =0; i<count; i++){
            int index = Integer.parseInt(sc.next())-1;
            students[index] = students[index] + 1;
        }

        for(int i=0; i<23; i++){
            System.out.print(students[i]+" ");
        }
    }
}
