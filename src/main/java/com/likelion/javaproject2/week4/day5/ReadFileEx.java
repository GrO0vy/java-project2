package com.likelion.javaproject2.week4.day5;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFileEx {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("./hospital.csv"));
        System.out.println(br.readLine());
    }
}