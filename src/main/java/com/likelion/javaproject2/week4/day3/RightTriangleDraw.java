package com.likelion.javaproject2.week4.day3;

import java.util.Scanner;

public class RightTriangleDraw {

    public void printShape(int height){
        for(int i=1; i<=height; i++){
            System.out.printf("%s\n","*".repeat(i));
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        RightTriangleDraw rtd = new RightTriangleDraw();
        int height = sc.nextInt();

        rtd.printShape(height);
    }
}
