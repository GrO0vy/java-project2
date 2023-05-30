package com.likelion.javaproject2.week7.day1;

public class ThreeSixNine2 {
    public static void main(String[] args) {
        for(int i = 0; i < 100; i++){
            System.out.println(i+"*".repeat(cntOfClap(i)));
        }
    }

    public static int cntOfClap(int number){
        int count = 0;
        while(number > 0){
            if(number % 10 == 3 || number % 10 == 6 || number % 10 == 9) count++;
            number /= 10;
        }
        return count;
    }

    public static String is369(int number){
        int count = 0;
        while(number > 0){
            if(number % 10 == 3 || number % 10 == 6 || number % 10 == 9) count++;
            number /= 10;
        }
        return "*".repeat(count);
    }
}
