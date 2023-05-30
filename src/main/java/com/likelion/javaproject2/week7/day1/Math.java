package com.likelion.javaproject2.week7.day1;

import java.util.ArrayList;
import java.util.List;

public class Math {
    public static boolean isPrime(int number){
        int count = 0;

        for (int i = 2; i < number; i++){
            if(number % i == 0) count++;
        }

        return ( count == 0 ) ? true : false;
    }

    public static boolean isPerfectNum(int number){
        int sum = 0;

        for(int i =1; i < number; i++){
            if(number % i == 0) sum += i;
        }

        return (sum == number) ? true : false;
    }

    public static List<Integer> calcDivisor(int number){
        List<Integer> divisors = new ArrayList<>();

        for(int i = 1; i <= number; i++){
            if(number % i == 0) divisors.add(i);
        }
        return divisors;
    }

    public static void main(String[] args) {
        int number = 6;
        System.out.println("isPrime : " + number + " -> " + isPrime(number));
        System.out.println("isPerfectNum : " + number + " -> " + isPerfectNum(number));
        System.out.println("divisors : " + number + " -> " + calcDivisor(number));
    }
}
