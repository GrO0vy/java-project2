package com.likelion.javaproject2.week4.day1;
class UserTest {
    public static void main(String[] args) {
        User user1 = new User();
        user1.name = "이민";
        user1.age = 14;

        User user2 = new User();
        user2.name = "김민";
        user2.age = 37;

        System.out.printf("%s는 어른인지? %b\n",user1.name ,user1.isAdult());
        System.out.printf("%s는 어른인지? %b\n",user2.name , user2.isAdult());
    }
}