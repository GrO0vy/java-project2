package com.likelion.javaproject2.week3.day1;

public class ConcatNumber {
    public int solution(int[] num_list) {
        int answer = 0;

        String oddResult = "";
        String evenResult = "";

        for(int i=0; i<num_list.length; i++){
            if(num_list[i] % 2 == 0) evenResult += num_list[i];
            else oddResult += num_list[i];
        }

        answer = Integer.parseInt(oddResult) + Integer.parseInt(evenResult);
        return answer;
    }
}
