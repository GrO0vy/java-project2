package com.likelion.javaproject2.week3.day2;

import java.util.Arrays;

public class SpecialTwoDimensionArrTest {
    public static void main(String[] args) {
        SpecialTwoDimensionArr stda = new SpecialTwoDimensionArr();

        int[][] result = stda.solution(5);

        for(int i = 0 ; i < 5; i++){
            System.out.println(Arrays.toString(result[i]));
        }
    }
}
