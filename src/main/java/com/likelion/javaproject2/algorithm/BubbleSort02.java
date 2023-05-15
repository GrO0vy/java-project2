package com.likelion.javaproject2.algorithm;

import java.util.Arrays;

public class BubbleSort02 {
    public int[] sortARound(int[] arr, int until) {
        for (int i = 0; i < until; i++) {
            if (arr[i] > arr[i + 1]) {
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
            }
        }
        return arr;
    }

    public int[] sort(int[] arr){
        for(int i=1; i<arr.length; i++){
            sortARound(arr,arr.length-i);
        }
        return arr;
    }

    public static void main(String[] args) {
        BubbleSort02 bubbleSort02 = new BubbleSort02();
        int[] arr = {7, 2, 3, 9, 28, 1};

        for(int j=1; j<arr.length; j++){
            bubbleSort02.sort(arr);
        }
        System.out.println(Arrays.toString(arr));
    }
}
