package com.likelion.javaproject2.week2.day5;

public class HallOfFameTest {
    public static void main(String[] args) {
        HallOfFame hallOfFame = new HallOfFame();

        int[] arr = new int[]{10,100,20,150,1,100,200};
        System.out.println(hallOfFame.solution(3,arr));
    }
}
