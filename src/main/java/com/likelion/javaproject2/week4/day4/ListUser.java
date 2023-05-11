package com.likelion.javaproject2.week4.day4;

import java.util.ArrayList;
import java.util.List;

public class ListUser {
    public static void main(String[] args) {
        List<User> user = new ArrayList<>();

        User user1 = new User("kim", "010-0000-0000", "1111", 25);
        user.add(user1);

        User user2 = new User("lee","010-1111-1111","12341234",29);
        user.add(user2);

        for(var u : user){
            System.out.printf("%s님의 전화번호는 %s 이고 나이는 %d세 입니다.\n",u.getName(),u.getPhoneNumber(),u.getAge());
        }

    }
}
