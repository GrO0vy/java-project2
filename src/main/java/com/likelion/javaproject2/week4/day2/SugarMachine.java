package com.likelion.javaproject2.week4.day2;

import java.util.Arrays;
import java.util.Scanner;

public class SugarMachine {
    private int[][] grid;

    public SugarMachine(){
        this.grid = new int[7][7];
    }

    public SugarMachine(int height , int width){
        this.grid= new int[height][width];
    }

    public int[][] setBeam(int lengthOfBar, int direction, int posX, int posY){
        if(direction ==0){
            for(int i=posY-1; i<posY+lengthOfBar-1; i++){
                if(this.grid[posX-1][i] == 0 ) this.grid[posX-1][i] = 1;
            }
        }
        else{
            for(int i=posX-1; i<posX+lengthOfBar-1; i++){
                if(this.grid[i][posY-1] == 0 ) this.grid[i][posY-1] = 1;
            }
        }
        return this.grid;
    }

    public void printGrid(int lengthOfBar, int direction, int posX, int posY){
        for(int i=0; i<this.grid.length; i++){
            System.out.println(Arrays.toString(setBeam(lengthOfBar,direction,posX,posY)[i]));
        }
        System.out.println("------------------------------------");
    }


    public static void main(String[] args) {
        SugarMachine sm = new SugarMachine(5,5);
        Scanner sc = new Scanner(System.in);
        int cntOfBar = sc.nextInt();
        for(int i=0; i<cntOfBar; i++){
            sm.printGrid(sc.nextInt(),sc.nextInt(),sc.nextInt(),sc.nextInt());
        }

        SugarMachine sm2 = new SugarMachine();
        for(int i=0; i<cntOfBar; i++){
            sm2.printGrid(sc.nextInt(),sc.nextInt(),sc.nextInt(),sc.nextInt());
        }
    }
}
