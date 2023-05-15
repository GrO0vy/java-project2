package com.likelion.javaproject2.algorithm;

import java.util.Arrays;

public class BubbleSort2 {
    public int[] sort(int[] arr){
        for(int i=0; i<arr.length-1; i++){
            for(int j =i+1; j<arr.length; j++){
                if(arr[i] > arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[i] = temp;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {7,2,3,9,28,11};
        BubbleSort02 bubbleSort02 = new BubbleSort02();

        System.out.println(Arrays.toString(bubbleSort02.sort(arr)));
    }
}
