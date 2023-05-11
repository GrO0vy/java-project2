package com.likelion.javaproject2.codeUp;

import com.likelion.javaproject2.week2.day3.Student;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class CodeUp3108 {

    public static boolean isExist(List<String[]> students, String code){
        for(int i=0; i<students.size(); i++){
            if(students.get(i)[1].equals(code)) return true;
        }
        return false;
    }

    public static void addStudent(List<String[]> students, String data[], int size){
        if(size == 0) students.add(data);
        else{
            for(int j=0; j<size; j++) {
                if (Integer.parseInt(data[1]) < Integer.parseInt(students.get(j)[1])) {
                    students.add(j, data);
                    break;
                }
                if(j == students.size()-1) {
                    students.add(data);
                    break;
                }
            }
        }
    }


    public static void deleteStudent(List<String[]> students, String data){
        for(int i = 0; i <students.size(); i++){
            if(students.get(i)[1].equals(data))  students.remove(i);
        }
    }

    public static void printStudents(List<String[]> students, int idx){
        System.out.printf("%s %s\n",students.get(idx)[1],students.get(idx)[2]);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<String[]> students = new ArrayList<>();
        int cntOfInput = sc.nextInt();
        sc.nextLine();

        for(int i = 0; i < cntOfInput; i++){
            String[] data = sc.nextLine().split(" ");
            if(data[0].equals("I")) {
                if(!isExist(students,data[1])){
                    addStudent(students,data,students.size());
                }
            }
            else {
                deleteStudent(students,data[1]);
            }
        }

        for (int i = 0; i < 5; i++) {
            printStudents(students,sc.nextInt()-1);
        }
    }
}
