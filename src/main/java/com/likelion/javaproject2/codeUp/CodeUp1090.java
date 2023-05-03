package com.likelion.javaproject2.codeUp;

import java.util.Scanner;

public class CodeUp1090 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int start = sc.nextInt();
        int multipleNum = sc.nextInt();
        int count = sc.nextInt();

        long result = start;
        int iterCnt = 1;

        while(iterCnt < count){
            result *= multipleNum;
            iterCnt++;
        }

        System.out.println(result);
        sc.close();
    }
}
