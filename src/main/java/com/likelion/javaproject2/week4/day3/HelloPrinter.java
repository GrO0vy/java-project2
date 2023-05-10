package com.likelion.javaproject2.week4.day3;

public class HelloPrinter{
    Printer2 printer;

    public HelloPrinter(Printer2 printer){
        this.printer = printer;
    }

    /*public void print(String message){
        System.out.println(message);
    }*/

    public void repeatMessage(int n, String message){
        for (int i = 0; i < n; i++) {
            printer.print(message);
        }
    }

    public static void main(String[] args) {
        HelloPrinter hp = new HelloPrinter(new ConsolePrinter2());
        hp.repeatMessage(5,"응애");
    }


}
