package org.practice.DSA.searching.binarySearch;

import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {9, 8, 7, 6, 4, 2, 1, 0};
        int[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8};
        int target = 2;
        int ans = orderAgnosticBinary(arr1, target);
        System.out.println(ans);
    }

    static int orderAgnosticBinary(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;
        boolean isAsc = arr[start] < arr[end];
        while(start <= end) {
            int mid = start + (end - start) / 2; //due to integer length complexity

            if(target == arr[mid]){
                return mid;
            }

            if(isAsc){
                if (target < arr[mid]) {
                    end = mid - 1;
                } else if (target > arr[mid]) {
                    start = mid + 1;
                }
            } else {
                if (target > arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
}
