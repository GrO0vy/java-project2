package com.likelion.javaproject2.week4.day2;

import java.util.Arrays;

public class SugarMachine {
    private int[][] grid;

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
        sm.printGrid(2,0,1,1);
        sm.printGrid(3,1,2,3);
        sm.printGrid(4,1,2,5);
    }
}
