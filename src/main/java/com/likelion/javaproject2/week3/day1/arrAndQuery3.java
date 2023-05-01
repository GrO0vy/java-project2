package com.likelion.javaproject2.week3.day1;

public class arrAndQuery3 {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer;

        for(int i=0; i<queries.length; i++){
            int val1 = queries[i][0];
            int val2 = queries[i][1];
            int temp =0;

            temp = arr[val1];
            arr[val1] = arr[val2];
            arr[val2] = temp;
        }

        answer = arr;
        return answer;
    }
}
