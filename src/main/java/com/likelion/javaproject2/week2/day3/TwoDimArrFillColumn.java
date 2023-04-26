package com.likelion.javaproject2.week2.day3;

public class TwoDimArrFillColumn {
    public static void main(String[] args) {
        int[][] arr = new int[5][5];

        arr[0][3] =1;
        arr[1][3] =2;
        arr[2][3] =3;
        arr[3][3] =4;
        arr[4][3] =5;

        for(int i=0; i<arr.length; i++){
            System.out.printf("arr[%d] : %d\n",i,arr[i][3]);
        }
    }
}
