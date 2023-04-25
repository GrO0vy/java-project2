package com.likelion.javaproject2.week2.day2;

public class StringEquals {
    public static void main(String[] args) {
        String s1 = "GOLD";
        String s2 = "GOLD";
        String s3 = "G";

        System.out.println(s1 == s2);

        boolean isSame = s1.substring(0,1) == s3;
        System.out.println(isSame);

        isSame = s1.substring(0,1).equals(s3);
        System.out.println(isSame);
    }
}
