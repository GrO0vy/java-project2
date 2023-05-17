package com.likelion.javaproject2.week5.day3.algorithm;

import java.util.EmptyStackException;

public class Stack4 {
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

    public static void main(String[] args) {
        Stack4 stack1 = new Stack4();
        System.out.println(stack1.isEmpty());
        stack1.push(30);
        System.out.println(stack1.isEmpty());
        stack1.pop();
        System.out.println(stack1.isEmpty());
        stack1.pop();
    }
}
