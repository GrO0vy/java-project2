package com.likelion.javaproject2.week2.day3;

import java.util.Arrays;

public class ArrayChallenge {
    public static void fillRow(int[][] arr, int rowNum){
        for(int i = 0; i<5; i++) {
            arr[rowNum][i] =1;
        }

        printTwoArr(arr);
    }

    public static void printTwoArr(int[][] arr){
        for(int i=0; i<5; i++){
            System.out.println(Arrays.toString(arr[i]));
        }
        System.out.println("================================");
    }

    public static void main(String[] args) {
        int[][] arr = new int[5][5];

        fillRow(arr ,1);
        fillRow(arr, 2);
    }
}
