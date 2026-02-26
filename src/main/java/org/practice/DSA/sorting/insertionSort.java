package org.practice.DSA.sorting;

import java.util.Arrays;

public class insertionSort {

    public static void main(String[] args) {
        int[] arr = {45, 44, 11, 2, 3, 5, 6};
        insertion(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void insertion(int[] arr){
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i+1; j > 0; j--) {
                if(arr[j] < arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
            }

        }
    }
}
