package com.likelion.javaproject2.codeUp;

import java.util.Scanner;

public class CodeUp1098 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int height = sc.nextInt();
        int width = sc.nextInt();
        int[][] shape = new int[height][width];
        int barCount = sc.nextInt();

        for(int i =0; i<barCount; i++){
            int barLength = sc.nextInt();
            int direction = sc.nextInt();
            int posX = sc.nextInt()-1;
            int posY = sc.nextInt()-1;

            if(shape[posX][posY] != 1) shape[posX][posY] =1;

            if(direction == 0){
                for(int j=posY+1; j<posY+barLength; j++){
                    shape[posX][j] =1;
                }
            }
            else{
                for(int j = posX; j<posX+barLength; j++){
                    shape[j][posY] =1;
                }
            }
        }
        for(int i=0; i<height; i++){
            for(int j=0; j<width; j++){
                System.out.print(shape[i][j]+" ");
            }
            System.out.println();
        }
    }
}
