package com.likelion.javaproject2.week5.day4.algorithm;

public class BracketWithoutStack {
    public static void main(String[] args) {
        String brackets = "((((())))))";

        while(brackets.indexOf("()") != -1){
            brackets = brackets.replace("()","");
        }

        System.out.println(brackets);

        if(brackets.length() == 0){
            System.out.println("올바른 괄호입니다.");
        }
        else{
            System.out.println("올바른 괄호가 아닙니다.");
        }
    }
}
