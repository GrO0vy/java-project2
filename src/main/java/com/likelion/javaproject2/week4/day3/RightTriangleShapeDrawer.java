package com.likelion.javaproject2.week4.day3;

public class RightTriangleShapeDrawer extends ShapeDrawer{

    @Override
    public String makeALine(int height ,int i) {
        return String.format("%s%s\n","","*".repeat(i+1));
    }

    public static void main(String[] args) {
        ShapeDrawer rightTriangle = new RightTriangleShapeDrawer();
        rightTriangle.printShape(7);
    }
}
