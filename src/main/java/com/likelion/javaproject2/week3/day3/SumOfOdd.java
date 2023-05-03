package com.likelion.javaproject2.week3.day3;

public class SumOfOdd {
    public static void main(String[] args) {
        int sumOfOdd = 0;
        for(int i=1; i<=10; i+=2){
            sumOfOdd += i;
        }
        System.out.println(sumOfOdd);
    }
}
