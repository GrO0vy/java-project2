package com.likelion.javaproject2.codeUp;

import java.util.Scanner;

public class CodeUp1274 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int divisorCnt = 0;

        for(int i = 2; i <num; i++ ){
            if(num % i == 0) divisorCnt++;
        }

        System.out.println(divisorCnt == 0 ? "소수입니다.":"소수가 아닙니다.");
    }
}
