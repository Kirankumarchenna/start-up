package org.practice.DSA;

import java.util.Arrays;

public class Rough {
    public static void main(String[] args) {
        int[] arr = {2, 45, 565, 676, 78};

        int left = 0;
        int right = arr.length-1;

        int mid = (left+right)/2;
        if(arr[mid] > mid){
            right = mid - 1;

        }
    }
}
