package com.likelion.javaproject2.week4.day5;

import java.io.*;
import java.nio.charset.Charset;
import java.util.LinkedList;
import java.util.List;

public class ReadFileEx implements LineReader {
    LineReader lineReader;
    String charSet;

    public ReadFileEx(String charSet){
        this.charSet = charSet;
    }
    public List<String> getLines(String filename) throws IOException {
        List<String> lines = new LinkedList<>();

        BufferedReader br = new BufferedReader(new FileReader(filename, Charset.forName(charSet)));

        String line;
        while ((line = br.readLine()) != null) {
            lines.add(line);
        }
        return lines;
    }

    public static void main(String[] args) throws IOException {
        ReadFileEx rfe = new ReadFileEx("UTF-8");
        List<String> result = rfe.getLines("hospital_info_10lines.csv");
        for (int i = 0; i < 10; i++) {
            System.out.println(result.get(i));
        }
    }
}