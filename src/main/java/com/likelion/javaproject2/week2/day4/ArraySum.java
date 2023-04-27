package com.likelion.javaproject2.week2.day4;

public class ArraySum {
    public static void main(String[] args) {
        int answer = 0 ;
        int[] arr = new int[]{2,1,7,9};
        answer = answer +arr[0];
        answer = answer +arr[1];
        answer = answer +arr[2];
        answer = answer +arr[3];

        System.out.println("합 : " +answer);
    }

    public static class BitOperatorEx {
        public static void main(String[] args) {
            int val1 = 1;

            System.out.println(val1 << 1);
            System.out.println(val1 << 2);
            System.out.println(val1 << 5);

            int val2 =32;
            System.out.println(val2 >> 1);
            System.out.println(val2 >> 2);
        }
    }
}
