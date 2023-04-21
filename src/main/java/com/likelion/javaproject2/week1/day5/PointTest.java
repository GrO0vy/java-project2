package com.likelion.javaproject2.week1.day5;

public class PointTest {
    public static void main(String[] args) {
        Point p1 = new Point();
        p1.x = 0;
        p1.y = 0;

        System.out.printf("xy 가 같은지? %s\n",p1.isSame());

        Point p2 = new Point();
        p2.x = 1;
        p2.y = 1;

        System.out.printf("xy 가 같은지? %s\n",p2.isSame());

        Point p3 = new Point();
        p3.x = 3;
        p3.y = 2;

        System.out.printf("xy 가 같은지? %s\n",p3.isSame());
    }

}
