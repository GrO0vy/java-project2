package com.likelion.javaproject2.week4.day2;

import java.util.Scanner;

public class ReversedPyramid {
    private String spaceChar =" ";

    public ReversedPyramid(String spaceChar){
        this.spaceChar = spaceChar;
    }

    public String makeALine(int height , int i){
        return String.format("%s%s",spaceChar.repeat(i),"*".repeat(2*(height-i)-1));
    }

    public void printSpaceWithLine(int height){
        for(int i=0; i<height; i++){
            System.out.println(makeALine(height,i));
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ReversedPyramid reversedPyramid = new ReversedPyramid("0");

        int height = sc.nextInt();
        reversedPyramid.printSpaceWithLine(height);

    }
}
