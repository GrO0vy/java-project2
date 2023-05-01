package com.likelion.javaproject2.week3.day1;

public class MultiplicationTableStep5 {

    public static void printDan(int dan){
        for(int i =1; i<10; i++){
            System.out.printf("%d * %d = %d\n",dan,i,dan*i);
        }
        System.out.println("=========================");
    }
    public static void main(String[] args) {
        printDan(3);
        printDan(5);
        printDan(7);
    }
}
