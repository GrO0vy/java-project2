package com.likelion.javaproject2.week5.day1.algorithm;

import java.util.Arrays;

public class BubbleSort01 {
    public static void main(String[] args) {
        int[] arr = {7, 2, 3, 9, 4, 3};

        int temp = arr[0];
        arr[0] = arr[1];
        arr[1] = temp;

        System.out.println(Arrays.toString(arr));

        temp = arr[1];
        arr[1] = arr[2];
        arr[2] = temp;

        System.out.println(Arrays.toString(arr));
    }
}
