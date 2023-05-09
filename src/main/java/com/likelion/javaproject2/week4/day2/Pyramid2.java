package com.likelion.javaproject2.week4.day2;

import java.util.Scanner;

public class Pyramid2 {
    String spaceChar = "0";

    public Pyramid2(String spaceChar){
        this.spaceChar = spaceChar;
    }

    public void printPyramidWithSpaceChar(int height){
        for(int i=0; i<height; i++){
            System.out.println(makeALine(height,i));
        }
    }

    public String makeALine(int height, int i){
        return String.format("%s%s",spaceChar.repeat(height-i-1),"*".repeat(2*i+1));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Pyramid2 pyramid = new Pyramid2("0");
        Pyramid2 pyramid2 = new Pyramid2(" ");
        int height = sc.nextInt();

        pyramid.printPyramidWithSpaceChar(height);
        System.out.println("=========================");
        pyramid2.printPyramidWithSpaceChar(height);
    }
}
