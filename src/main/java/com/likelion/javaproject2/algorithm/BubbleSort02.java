package com.likelion.javaproject2.algorithm;

import java.util.Arrays;

public class BubbleSort02 {
    public int[] sortARound(int[] arr){
        for (int i = 0; i < arr.length-j; i++) {
            if (arr[i] > arr[i + 1]) {
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
            }
        }

    }
    public static void main(String[] args) {
        BubbleSort02 bubbleSort02 = new BubbleSort02();
        int[] arr = {7, 2, 3, 9, 28, 1};

        for(int j=1; j<arr.length; j++){
            bubbleSort02.sortARound(arr);
        }
        System.out.println(Arrays.toString(arr));
    }
}
