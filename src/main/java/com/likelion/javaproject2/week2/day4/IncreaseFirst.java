package com.likelion.javaproject2.week2.day4;

public class IncreaseFirst {
    public static void main(String[] args) {
        int idx = 0;
        int[] arr = {2,1,7,4};
        System.out.println(arr[idx]);
        idx+=1;
        System.out.println(arr[idx]);
        idx+=1;
        System.out.println(arr[idx]);

        System.out.println("========================");
        int idx2 =0;
        int[] arr2 = {2,1,7,4};
        System.out.println(arr[idx2++]);
        System.out.println(arr[idx2++]);
        System.out.println(arr[idx2]);
    }
}