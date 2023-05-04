package com.likelion.javaproject2.codeUp;

import java.util.Scanner;

public class CodeUp1097 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[][] badook= new String[19][19];
        for(int i=0; i<19; i++){
            badook[i] = sc.nextLine().split(" ");
        }

        int count = sc.nextInt();
        for(int i=0; i<count; i++){
            int posX = sc.nextInt()-1;
            int posY = sc.nextInt()-1;

            for(int j=0; j<19; j++){
                if(badook[posX][j].equals("0")) badook[posX][j] = "1";
                else badook[posX][j] ="0";
            }

            for(int j=0; j<19; j++){
                if(badook[j][posY].equals("0")) badook[j][posY] = "1";
                else badook[j][posY] ="0";
            }
        }
        for(int i=0; i<19; i++){
            for(int j=0; j<19; j++){
                System.out.print(badook[i][j]+" ");
            }
            System.out.println();
        }
    }
}
