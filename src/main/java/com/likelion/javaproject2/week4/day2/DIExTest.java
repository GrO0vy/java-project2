package com.likelion.javaproject2.week4.day2;

public class DIExTest {
    public static void main(String[] args) {
        DiEx diEx = new DiEx(new ParallelogramShapeDrawer());
        diEx.doSth();

        DiEx diEx2 = new DiEx(new PyramidShapeDrawer());
        diEx2.doSth();
    }
}
