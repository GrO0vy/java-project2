package com.likelion.javaproject2.week1.day5;

public class PointTest {
    public static void main(String[] args) {
        Point p1 = new Point();
        p1.x = 0;
        p1.y = 0;

        Point p2 = new Point();
        p2.x = 1;
        p2.y = 1;

        Point p3 = new Point();
        p3.x = 3;
        p3.y = 2;

        System.out.printf("p1 의 xy 가 같은지? %s\n",p1.isSame());
        System.out.printf("p1과 p2 사이의 거리 : %f\n",p1.getDistance(p2));

        System.out.printf("p2 의 xy 가 같은지? %s\n",p2.isSame());
        System.out.printf("p2와 p3 사이의 거리 : %f\n",p2.getDistance(p3));


        System.out.printf("p3 의 xy 가 같은지? %s\n",p3.isSame());
        System.out.printf("p3과 p1 사이의 거리 : %f\n",p3.getDistance(p1));
    }

}
