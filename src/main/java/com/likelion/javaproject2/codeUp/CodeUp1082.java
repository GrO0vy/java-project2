package com.likelion.javaproject2.codeUp;

import java.util.Scanner;

public class CodeUp1082 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = Integer.parseInt(sc.next(),16);

        for(int i=1; i<=15; i++){
            System.out.printf("%X*%X=%X\n",num,i,num*i);
        }
    }
}
