package com.likelion.javaproject2.codeUp;

import java.util.Scanner;

public class CodeUp1620 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int result = 0;

        while(num > 0){
            result += num % 10;
            num /=10;
            if(result >= 10 && num == 0) {
                num = result;
                result =0;
            }
        }
        System.out.println(result);
    }
}
