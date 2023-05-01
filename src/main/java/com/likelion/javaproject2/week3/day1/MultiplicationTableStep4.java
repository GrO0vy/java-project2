package com.likelion.javaproject2.week3.day1;

public class MultiplicationTableStep4 {
    public static void main(String[] args) {

        int dan[] = {2,4,6,8};

        for(int i = 0 ; i < dan.length; i++){
            for(int j = 1; j < 10; j++){
                System.out.printf("%d * %d = %d\n", dan[i],j , dan[i] * j);
            }
            System.out.println("==========================");
        }
    }
}
