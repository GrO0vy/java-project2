package com.likelion.javaproject2.week3.day1;

public class makeArr {
    public int[] solution(int l, int r) {
        int[] answer = {};

        for(int i=l; i<=r; i++){
            int number = i;
            for(;number>0;){
                if((number%10) % 5 == 0) number/=10;
                else break;
            }
            if(number == 0){
                int[] result = new int[answer.length+1];
                for(int j=0; j<answer.length; j++){
                    result[j] = answer[j];
                }
                result[answer.length] = i;
                answer = result;
            }
        }
        if(answer.length == 0) answer = new int[]{-1};
        return answer;
    }
}
