package com.likelion.javaproject2.week2.day5;

import java.util.Scanner;

public class NanuriClinicHours {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String day = sc.next();
        String breakTime = "12:30 ~ 13:30";
        String time = "";
        switch (day) {
            case "월", "화", "수", "목", "금":
                time = "09:00 ~ 18:00";
                break;
            case "토":
                time = "09:00 ~ 15:00";
                break;
            case "일":
                time = "정기휴무 ( 매주 일요일 )";
                breakTime = "X";
                break;
        }
            System.out.printf("%s요일 : %s\n" +
                              "휴게시간 : %s",day,time,breakTime);
    }
}
