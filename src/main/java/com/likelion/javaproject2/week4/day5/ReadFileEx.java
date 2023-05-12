package com.likelion.javaproject2.week4.day5;

import com.likelion.javaproject2.week4.day4.Address;
import com.likelion.javaproject2.week4.day4.Hospital;

import java.io.*;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class ReadFileEx implements LineReader {
    LineReader lineReader;
    Charset charset;

    public ReadFileEx(Charset charset){
        this.charset = charset;
    }
    public List<String> getLines(String filename) throws IOException {
        List<String> lines = new LinkedList<>();

        BufferedReader br = new BufferedReader(new FileReader(filename, charset));

        String line;
        while ((line = br.readLine()) != null) {
            lines.add(line);
        }
        return lines;
    }
    public Hospital parse(String str){
        String[] splitted = str.split(",");

        Address address = new Address(splitted[10],splitted[5],splitted[7]);
        Hospital hospital = new Hospital(splitted[1], splitted[11],address);

        return hospital;
    }

    public List<Hospital> getHospital(List<String> lines){
        List<Hospital> hospitals = new ArrayList<>();
        for(String line : lines){
            hospitals.add(parse(line));
        }
        return hospitals;
    }
    public static void main(String[] args) throws IOException {
        ReadFileEx rfe = new ReadFileEx(Charset.forName("UTF-8"));
        List<String> strLines = rfe.getLines("hospital_info_10lines.csv");
        List<Hospital> parsedHospital = rfe.getHospital(strLines);
        System.out.println(parsedHospital.get(1).getName());

    }
}