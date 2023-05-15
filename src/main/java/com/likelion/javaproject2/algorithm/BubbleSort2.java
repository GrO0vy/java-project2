package com.likelion.javaproject2.algorithm;

public class BubbleSort2 {
    public static void main(String[] args) {
        int[] arr = {7,2,3,9,28,11};

        for(int i =1; i<arr.length; i++){
            if(arr[0] > arr[i]){
                int temp = arr[0];
                arr[0] = arr[i];
                arr[i] = temp;
            }
        }
    }
}
