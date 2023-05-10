package com.likelion.javaproject2.week4.day3;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class RightTrianglePrinter {

    private Printer printer;

    public RightTrianglePrinter(Printer printer){
        this.printer = printer;
    }
    public String makeALine(int h, int i) {
        return String.format("%s%s\n", "", "*".repeat(i));
    }

    /*public void printToFile(String[] lines) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter("./aaa.txt"));
        for(int i=0; i<lines.length;i++){
            bw.append(lines[i]);
        }
        bw.flush();
        bw.close();
    }*/


    /*public void printToConsole(String[] lines){
        for (int i = 0; i < lines.length; i++) {
            System.out.print(lines[i]);
        }
    }*/

    public void printShape(int h) throws IOException {
        String[] lines = new String[h];
        for (int i = 0; i < h; i++) {
            lines[i] = makeALine(h, i+1);
        }

        printer.print(lines);
    }

    public static void main(String[] args) throws IOException {
        RightTrianglePrinter rtp = new RightTrianglePrinter(new ConsolePrinter());
        rtp.printShape(5);

        RightTrianglePrinter rtp2 = new RightTrianglePrinter(new FilePrinter());
        rtp2.printShape(6);
    }
}
