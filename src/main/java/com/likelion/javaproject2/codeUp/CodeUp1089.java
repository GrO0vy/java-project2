package com.likelion.javaproject2.codeUp;

import java.util.Scanner;

public class CodeUp1089 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int start = sc.nextInt();
        int plusNum = sc.nextInt();
        int count = sc.nextInt();

        int result = start;
        int iterCnt =0;

        while(iterCnt < count-1){
            result += plusNum;
            iterCnt++;
        }
        System.out.println(result);
    }
}
