package com.likelion.javaproject2.week2.day2;

public class AccountMessage {
    public static void main(String[] args){
        String name = "이민철";
        int balance = 2_000_0000;
        String message = name + " 님의 통장잔고는 " +balance+"원 입니다.";
        System.out.println(message);
    }
}
