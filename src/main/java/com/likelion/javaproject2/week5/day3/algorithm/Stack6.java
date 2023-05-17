package com.likelion.javaproject2.week5.day3.algorithm;

import java.util.EmptyStackException;

public class Stack6 {
    private int[] arr = new int[10000];
    private int pointer =0;

   /* public Stack(int size){
        this.size = size;
    }*/

    public boolean isEmpty(){
        return this.pointer == 0;
    }
    public void push(int value){
        this.arr[pointer++] = value;
       /* System.out.println(Arrays.toString(arr));
        System.out.println(pointer);*/
    }

    public int pop(){
        //if(isEmpty()) throw new RuntimeException("스택이 비었습니다.");
        if(isEmpty()) throw new EmptyStackException();
        return this.arr[--pointer];
    }

    public int peek(){
        if(isEmpty()) throw new RuntimeException("스택이 비었습니다.");
        //if(isEmpty()) throw new EmptyStackException();
        return this.arr[pointer-1];
    }

    public static void main(String[] args) {
        Stack6 stack1 = new Stack6();
        stack1.peek();
    }
}
