package com.likelion.javaproject2.week4.day4;

public class User {
    private String name;
    private String phoneNumber;
    private String password;
    private int age;

    public User(String name, String phoneNumber, String password, int age) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.password = password;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    boolean isAdult() {

        return age >= 18;
    }
}
