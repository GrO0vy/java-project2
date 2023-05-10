package com.likelion.javaproject2.week4.day3;

public class PyramidShapeDrawer extends ShapeDrawer{

    @Override
    public String makeALine(int height , int i) {
        return String.format("%s%s\n" ," ".repeat(height -i-1),"*".repeat(2*i+1));
    }

    public static void main(String[] args) {
        PyramidShapeDrawer psd = new PyramidShapeDrawer();
        psd.printShape(5);
    }
}
