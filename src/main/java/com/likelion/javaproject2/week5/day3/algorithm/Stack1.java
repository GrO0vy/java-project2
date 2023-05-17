package com.likelion.javaproject2.week5.day3.algorithm;

import java.util.Arrays;

public class Stack1 {
    private int[] arr = new int[10000];
    private int pointer =0;

   /* public Stack(int size){
        this.size = size;
    }*/

    public void push(int value){
        this.arr[pointer++] = value;
        System.out.println(Arrays.toString(arr));
        System.out.println(pointer);
    }

    public static void main(String[] args) {
        Stack1 stack1 = new Stack1();
        stack1.push(10);
        stack1.push(20);
    }
}
