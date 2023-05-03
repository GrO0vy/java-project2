package com.likelion.javaproject2.week3.day3;

public class isPrimeRoot {
    public static void main(String[] args) {
        int num = 6;
        int factors = 0;

        for (int i = 2; i*i < num; i++){
            if(num % i == 0) factors++;
        }

        System.out.printf("factors : %d\n",factors);
        System.out.println(factors ==0 ? "소수입니다" : "소수가 아닙니다.");
    }
}
