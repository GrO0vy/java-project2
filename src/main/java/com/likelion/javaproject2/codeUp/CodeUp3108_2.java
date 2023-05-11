package com.likelion.javaproject2.codeUp;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class CodeUp3108_2 {
    List<Student> students = new ArrayList<>();

    private Student makeAStudent(String insertOrDelete, int code, String name){
        return new Student(insertOrDelete,code,name);
    }

    private void addAStudent(Student student){
        if(!isExist(student)) {
            for(int i =0; i<students.size(); i++){
                if(isSmallerThanStudent(student,i)) {
                    students.add(i,student);
                    return;
                }
            }
            students.add(student);
        }
    }

    private void deleteStudent(Student student){
        for(int i=0; i<students.size(); i++){
            if(students.get(i).getCode() == student.getCode()) {
                students.remove(i);
                return;
            }
        }
    }

    private boolean isSmallerThanStudent(Student student, int idx){
        if(students.get(idx).getCode() > student.getCode()) return true;
        return false;
    }

    private boolean isExist(Student student){
        for(var stu : students){
            if(stu.getCode() == student.getCode()) return true;
        }
        return false;
    }

    public void printSpecificStudent(int[] indexes){
        for(int i = 0; i <5; i++){
            System.out.printf("%s %s\n",students.get(indexes[i]).getCode(), students.get(indexes[i]).getName());
        }
    }

    public void process(String insertOrDelete, int code, String name){
        Student student = makeAStudent(insertOrDelete, code, name );

        if(student.getInsertOrDelete().equals("I")) addAStudent(student);
        else deleteStudent(student);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CodeUp3108_2 codeUp3108_2 = new CodeUp3108_2();

        int cntOfData = sc.nextInt();
        sc.nextLine();

        for(int i=0; i<cntOfData; i++){
            String[] data = sc.nextLine().split(" ");
            codeUp3108_2.process(data[0],Integer.parseInt(data[1]),data[2]);
        }

        int[] indexes = {sc.nextInt()-1,sc.nextInt()-1,sc.nextInt()-1,sc.nextInt()-1,sc.nextInt()-1};

        codeUp3108_2.printSpecificStudent(indexes);
    }
}

class Student{
    private String insertOrDelete;
    private int code;
    private String name;


    public Student(String insertOrDelete, int code, String name) {
        this.insertOrDelete = insertOrDelete;
        this.code = code;
        this.name = name;
    }

    public String getInsertOrDelete() {
        return insertOrDelete;
    }
    public int getCode() {
        return code;
    }
    public String getName() {
        return name;
    }
}