package com.likelion.javaproject2.codeUp;

import java.util.Scanner;

class CodeUp1069 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String eval = sc.next();

        switch (eval){
            case "A" :
                System.out.println("best!!!");
                break;
            case "B" :
                System.out.println("good!!");
                break;
            case "C":
                System.out.println("run!");
                break;
            case "D":
                System.out.println("slowly~");
                break;
            default:
                System.out.println("what?");
        }
        sc.close();
    }
}
