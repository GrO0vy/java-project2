package com.likelion.javaproject2.week5.day2.algorithm;

import java.util.Arrays;

public class InsertionSortGeneric {

    public Character[] sort(Character[] arr, boolean isAscending){
        for (int i = 0; i < arr.length; i++) {
            for(int j = i; j>0; j--){
                if((isAscending ? (arr[j-1] - arr[j] ) : (arr[j] - arr[j-1] )) > 0){
                    Character temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }else{
                    break;
                }
            }
        }
        return arr;
    }

    public Character[] sort(Character[] arr){
        return sort(arr,true);
    }

    public int[] sort(int[] arr , boolean isAscending){
        for (int i = 0; i < arr.length; i++) {
            for(int j = i; j>0; j--){
                if((isAscending ? (arr[j-1] - arr[j] ) : (arr[j] - arr[j-1] )) > 0){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }else{
                    break;
                }
            }
        }
        return arr;
    }

    public int[] sort(int[] arr){
        return sort(arr, true);
    }
    public static void main(String[] args) {
        InsertionSortGeneric is = new InsertionSortGeneric();
        //int[] arr = {7, 2, 3, 9, 28, 11};
        Character[] cArr = {'f','e','g','a','c'};
        cArr = is.sort(cArr);
        System.out.println(Arrays.toString(cArr));

        //System.out.println(Arrays.toString(is.sort(arr,true)));
    }
}
