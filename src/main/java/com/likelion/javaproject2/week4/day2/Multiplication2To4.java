package com.likelion.javaproject2.week4.day2;

public class Multiplication2To4 {
    public static void printMultiplicationTable(int dan){
        for(int i=1; i<=9; i++){
            System.out.printf("%d * %d = %d\n",dan, i ,dan*i);
        }
        System.out.println("------------------------");
    }
    public static void main(String[] args) {
        for(int i =2; i<=4; i++){
            printMultiplicationTable(i);
        }
    }
}
