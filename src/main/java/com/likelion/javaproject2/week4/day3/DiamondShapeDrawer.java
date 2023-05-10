package com.likelion.javaproject2.week4.day3;

public class DiamondShapeDrawer extends ShapeDrawer{
    @Override
    public String makeALine(int height, int i) {
        int pivot = height / 2;
        String line = "";
        if(i<=pivot){
            for(int j =0; j<pivot-i; j++){
                line += " ";
            }
            for(int j = 0; j<2*i+1; j++){
                line += "*";
            }
        }
        else {
            for (int j = 0; j < i - pivot; j++) {
                line += " ";
            }
            for (int j = 0; j < 2 * (height - i) - 1; j++) {
                line += "*";
            }
        }
        line += "\n";
        return line;
    }

    public static void main(String[] args) {
        DiamondShapeDrawer dsd = new DiamondShapeDrawer();

        dsd.printShape(5);
    }
}
