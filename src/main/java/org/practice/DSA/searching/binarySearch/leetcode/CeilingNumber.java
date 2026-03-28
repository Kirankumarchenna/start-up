package org.practice.DSA.searching.binarySearch.leetcode;

public class CeilingNumber {
    public static void main(String[] args) {
        int[] arr = {2, 5, 7, 8, 9, 10};
        int target = 6;
        int ans = ceilingNumber(arr, target);
        System.out.println(ans);
    }

    static int ceilingNumber(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;

        while(start <= end){
            int mid = start + (end - start) / 2;

            if(target > arr[arr.length-1]){
                return - 1;
            }

            if(target < arr[mid]){
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return start;
    }
}
