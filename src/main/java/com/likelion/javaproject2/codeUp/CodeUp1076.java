package com.likelion.javaproject2.codeUp;

import java.io.IOException;
import java.io.InputStreamReader;

public class CodeUp1076 {
    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);

        int letter = isr.read();
        char start = 'a';

       while((int)start<=letter) {
           System.out.println((char)start);
           start++;
       }
    }
}
