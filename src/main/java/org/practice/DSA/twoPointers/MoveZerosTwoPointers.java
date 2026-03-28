package org.practice.DSA.twoPointers;

import java.util.Arrays;

public class MoveZerosTwoPointers {
    public static void main(String[] args) {
        int[] arr = {0, 2, 4, 0, 3, 4, 0, 0};
        moveZerosToTheRight(arr);
        moveZerosToTheLeft(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void moveZerosToTheRight(int[] arr){
        int start = 0;

        for (int end = 0; end < arr.length; end++) {
            if(arr[end] != 0){
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
            }
        }
    }

    static void moveZerosToTheLeft(int[] arr){
        int start = 0;

        for(int end = 0; end < arr.length; end++){
            if(arr[end] == 0){
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
            }
        }
    }
}
