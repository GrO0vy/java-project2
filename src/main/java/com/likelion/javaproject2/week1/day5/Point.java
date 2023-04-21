package com.likelion.javaproject2.week1.day5;

public class Point {
    int x;
    int y;

    boolean isSame(){
        return x == y;
    }

    double getDistance(Point point){
        return Math.sqrt(Math.pow(this.x - point.x,2) + Math.pow(this.y-point.y,2));
    }
}
