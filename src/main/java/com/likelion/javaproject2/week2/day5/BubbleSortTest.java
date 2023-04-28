package com.likelion.javaproject2.week2.day5;

import java.util.Arrays;

public class BubbleSortTest {
    public static void main(String[] args) {
        int[] arr = {2,1,8,10,9,13,15,7,20};

        BubbleSort bubbleSort = new BubbleSort();
        System.out.println(Arrays.toString(bubbleSort.sort(arr)));
    }
}
