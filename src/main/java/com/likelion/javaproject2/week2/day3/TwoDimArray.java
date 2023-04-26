package com.likelion.javaproject2.week2.day3;

public class TwoDimArray {
    public static void main(String[] args) {
        int[][] arr = new int[3][3];
        int[] arr0 = arr[0];
        arr[0][0] =1;
        arr[0][1] =2;
        arr[0][2] =3;

        System.out.println(arr0[0]);
        System.out.println(arr0[1]);
        System.out.println(arr0[2]);
    }
}
