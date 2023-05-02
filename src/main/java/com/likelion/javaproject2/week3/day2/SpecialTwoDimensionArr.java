package com.likelion.javaproject2.week3.day2;

public class SpecialTwoDimensionArr {

    public int[][] solution(int n) {
        int[][] answer = {};

        int[][] arr = new int[n][n];

        for (int i = 0; i < n; i++) {
            arr[i][i] = 1;
        }

        answer = arr;
        return answer;
    }
}
