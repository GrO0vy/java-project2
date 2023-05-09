package com.likelion.javaproject2.week4.day2;

public class ParallelogramShapeDrawer extends ShapeDrawer{
    @Override
    public String makeALine(int height, int i) {
        return String.format("%s%s"," ".repeat(height-i-1),"*".repeat(height));
    }
}
