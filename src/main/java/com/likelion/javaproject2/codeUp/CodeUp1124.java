package com.likelion.javaproject2.codeUp;

import java.util.Arrays;
import java.util.Scanner;

public class CodeUp1124 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String strs = sc.next();


        int c = 12 * Integer.parseInt(strs.substring(strs.indexOf("C")+1,strs.indexOf("H")));
        int h = Integer.parseInt(strs.substring(strs.indexOf("H")+1));

        System.out.println(c+h);
    }
}
