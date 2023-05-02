package com.likelion.javaproject2.week3.day2;

public class WhileFactorial {
    public static void main(String[] args) {
        int n = 5;
        int answer = 1;
        while( n > 0){
            answer *= n--;
            // answer = answer * n;
            // n = n - 1;
        }
        System.out.println(answer);
    }
}
