package com.likelion.javaproject2.week2.day5;

public class HallOfFame {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];

        for(int i = 0; i<score.length; i++){
            int min = score[0];
            for(int j=0; j<=i; j++){
                if(min > score[j]) min = score[j];
            }
            answer[i] = min;
        }

        return answer;
    }
}
