package com.likelion.javaproject2.week3.day3;

import java.util.Scanner;

public class SumDivisor {
    public int solution(int n) {
        int answer = 0;

        for (int i=1; i<=n; i++){
            if(n % i == 0) answer += i;
        }

        return answer;
    }
}
