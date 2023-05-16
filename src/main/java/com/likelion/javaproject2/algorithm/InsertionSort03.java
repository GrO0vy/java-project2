package com.likelion.javaproject2.algorithm;

import java.util.Arrays;

public class InsertionSort03 {

    public int[] sort(int[] arr , boolean isAscending){
        for (int i = 0; i < arr.length; i++) {
            for(int j = i; j>0; j--){
                if((isAscending ? (arr[j-1] - arr[j] ) : (arr[j] - arr[j-1] )) > 0){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }else{
                    break;
                }
            }
        }
        return arr;
    }

    public int[] sort(int[] arr){
        return sort(arr, true);
    }
    public static void main(String[] args) {
        InsertionSort03 is = new InsertionSort03();
        int[] arr = {7, 2, 3, 9, 28, 11};


        System.out.println(Arrays.toString(is.sort(arr,true)));
    }
}
