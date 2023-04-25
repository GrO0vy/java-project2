package com.likelion.javaproject2.codeUp;

import java.util.Scanner;

public class CodeUp1034 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String num = sc.next();
        int result = 0;

        StringBuffer sb = new StringBuffer(num);
        num = sb.reverse().toString();

        for(int i=0; i<num.length(); i++){
            result += (int) Math.pow(8, i) * Integer.parseInt(String.valueOf(num.charAt(i)));
        }
        System.out.println(result);
        sc.close();
    }
}
