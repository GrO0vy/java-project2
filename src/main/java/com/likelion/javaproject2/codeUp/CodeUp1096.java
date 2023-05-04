package com.likelion.javaproject2.codeUp;

import java.util.Scanner;

public class CodeUp1096 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] badook = new int[19][19];
        int numOfStone = sc.nextInt();

        for(int i=0; i<numOfStone; i++){
            int posX = sc.nextInt()-1;
            int posY = sc.nextInt()-1;

            badook[posX][posY] = 1;
        }

        for(int i=0; i<19; i++){
            for(int j=0; j<19; j++){
                System.out.print(badook[i][j]+" ");
            }
            System.out.println();
        }
    }
}
