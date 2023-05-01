package com.likelion.javaproject2.week3.day1;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class DiceGame2 {
    public int solution(int a, int b, int c) {
        int answer =0;
        Set<Integer> numbers = new HashSet<>(Arrays.asList(a,b,c));
        int notDuplicateCount = numbers.size();

        switch(notDuplicateCount){
            case 3 :  answer = a + b + c; break;
            case 2 : answer =(a + b + c) * (a*a + b*b + c*c); break;
            case 1 : answer =(a + b + c) * (a*a + b*b+ c*c) * (a*a*a + b*b*b + c*c*c); break;
        };
        return answer;
    }
}
