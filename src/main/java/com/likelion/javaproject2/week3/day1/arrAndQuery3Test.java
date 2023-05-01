package com.likelion.javaproject2.week3.day1;

import java.util.Arrays;

public class arrAndQuery3Test {
    public static void main(String[] args) {
        arrAndQuery3 aaq3 = new arrAndQuery3();

        int arr[] = new int[]{0,1,2,3,4};
        int queries[][] = new int[][]{{0,3},{1,2},{1,4}};

        System.out.println(Arrays.toString(aaq3.solution(arr,queries)));
    }
}
