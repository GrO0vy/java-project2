package com.likelion.javaproject2.week4.day1;

import java.util.Scanner;

public class MutsaMath {
    // 약수의 합을 리턴하는 메소드
    int sumOfFactors(int num){
        int sum = 1;

        for(int i=2; i<=num; i++){
            if(num % i == 0) sum += i;
        }
        return sum;
    }

    void printResult(int num){
        System.out.printf("%d의 약수의 합 : %d",num, sumOfFactors(num));
    }

    public static void main(String[] args) {
        MutsaMath mutsaMath = new MutsaMath();
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        mutsaMath.printResult(num);
    }
}
