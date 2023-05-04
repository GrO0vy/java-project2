package com.likelion.javaproject2.codeUp;

import java.util.Scanner;

public class CodeUp1099 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[][] maze = new String[10][10];
        for(int i=0; i<10; i++){
            maze[i] = sc.nextLine().split(" ");
        }

        int posX = 1;
        int posY = 1;

        while(!maze[posX][posY].equals("2")){
            maze[posX][posY] = "9";
            if(!maze[posX][posY+1].equals("1")) posY +=1;
            else if(!maze[posX+1][posY].equals("1")) posX +=1;
            else break;
        }
        maze[posX][posY] = "9";


        for(int i=0; i<10; i++){
            for(int j=0; j<10; j++){
                System.out.print(maze[i][j]+" ");
            }
            System.out.println();
        }
    }
}
