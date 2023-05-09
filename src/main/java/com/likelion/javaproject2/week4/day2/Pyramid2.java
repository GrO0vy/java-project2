package com.likelion.javaproject2.week4.day2;

import java.util.Scanner;

public class Pyramid2 {
    String spaceChar = "0";

    public Pyramid2(String spaceChar){
        this.spaceChar = spaceChar;
    }

    public void printPyramid(int height){
        for(int i=0; i<height; i++){
            System.out.println(spaceChar.repeat(height-i-1)+"*".repeat(2*i+1));
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Pyramid2 pyramid = new Pyramid2("0");
        Pyramid2 pyramid2 = new Pyramid2(" ");
        int height = sc.nextInt();

        pyramid.printPyramid(height);
        System.out.println("=========================");
        pyramid2.printPyramid(height);
    }
}
