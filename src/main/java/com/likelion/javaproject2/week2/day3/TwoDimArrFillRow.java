package com.likelion.javaproject2.week2.day3;

import java.util.Arrays;

public class TwoDimArrFillRow {
    public static void main(String[] args) {
        int[][] arr = new int[5][5];

        arr[1][0]=1;
        arr[1][1]=2;
        arr[1][2]=3;
        arr[1][3]=4;
        arr[1][4]=5;

        System.out.println(Arrays.toString(arr[1]));
        System.out.println(arr[1][0]);
        System.out.println(arr[1][1]);
        System.out.println(arr[1][2]);
        System.out.println(arr[1][3]);
        System.out.println(arr[1][4]);
    }
}
