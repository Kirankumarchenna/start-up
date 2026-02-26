package org.practice.DSA.sorting;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5, 3, 4};
        int[] arr1 = {1, 2, 3, 4, 5, 6};
        bubble(arr1);
        System.out.println(Arrays.toString(arr1));
    }

    static void bubble(int[] arr){
        boolean swapped;
        for (int i = 0; i < arr.length; i++) {
            swapped = false;
            for (int j = 1; j < arr.length - i; j++) { // here i used < arr.length - i cz the last element is already sorted and we don't need it to be checked in the loop
                if(arr[j] < arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    swapped = true;
                }
            }
            if(!swapped){
                break;
            }
        }
    }
}
