package com.likelion.javaproject2.week3.day2;

import java.time.LocalDateTime;

public class WhileCnt {
    public static void main(String[] args) {
        int cnt = 0;
        while(cnt <11){
            System.out.println(cnt++);
        }
        System.out.println("cnt = "+cnt);
    }
}
