package com.likelion.javaproject2.week3.day3;

public class Factorization {
    private static int[] returnNewArr(int[] answer, int num){
        int[] newArr = new int[answer.length+1];
        for(int i=0; i<answer.length; i++){
            newArr[i] = answer[i];
        }
        newArr[answer.length] = num;
        return newArr;
    }

    public int[] solution(int n) {
        int[] answer = {};

        for(int i = 2; i<=n; i++){
            if(n % i ==0){
                while(n % i == 0){
                    n /= i;
                }
                answer = returnNewArr(answer,i);
            }
        }
        return answer;
    }
}
