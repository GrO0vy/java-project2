package com.likelion.javaproject2.week7.day1;

public class ThreeSixNine3 {
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
        String clap = (number %10 %3) == 0 && number != 0 ? "*":"";
        number/=10;
        if(number == 0) return clap;
        return clap + is369(number);
    }
}
