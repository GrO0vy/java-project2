package com.likelion.javaproject2.codeUp;

import java.io.*;

public class CodeUp1084 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String input = bf.readLine();

        String[] numbers = input.split(" ");
        int count = 0;

        for(int i=0; i<Integer.parseInt(numbers[0]); i++){
            for(int j=0; j<Integer.parseInt(numbers[1]); j++){
                for(int k=0; k<Integer.parseInt(numbers[2]); k++){
                    bw.write(i+" "+j+" "+k+" \n");
                    count++;
                }
            }
        }
        bw.flush();
        System.out.println(count);
    }
}
