package com.likelion.javaproject2.week4.day3;

import java.util.Scanner;

public class DrawDiamond {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int height = sc.nextInt();
        int pivot = height / 2;

        for (int i = 0; i < height; i++) {
            if(i<=pivot){
                for(int j =0; j<pivot-i; j++){
                    System.out.print(" ");
                }
                for(int j = 0; j<2*i+1; j++){
                    System.out.print("*");
                }
            }
            else{
                for(int j = 0; j<i-pivot; j++){
                    System.out.print(" ");
                }
                for(int j =0; j <2*(height-i)-1; j++){
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
