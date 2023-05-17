package com.likelion.javaproject2.week5.day3.algorithm;

public class Stack2 {
    private int[] arr = new int[10000];
    private int pointer =0;

   /* public Stack(int size){
        this.size = size;
    }*/

    public void push(int value){
        this.arr[pointer++] = value;
       /* System.out.println(Arrays.toString(arr));
        System.out.println(pointer);*/
    }

    public int pop(){
        return this.arr[--pointer];
    }

    public static void main(String[] args) {
        Stack2 stack1 = new Stack2();
        stack1.push(10);
        stack1.push(20);
        System.out.println(stack1.pop());
        System.out.println(stack1.pop());
    }
}
