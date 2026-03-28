package org.practice.DSA.searching.binarySearch.leetcode;

public class FloorNumber {
    public static void main(String[] args) {
        int[] arr = {2, 5, 6, 7, 8, 9, 11, 13};
        int target = 10;
        int ans = floorNumber(arr, target);
        System.out.println(ans);
    }

    static int floorNumber(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;

        while(start <= end){
            int mid = start + (end - start) / 2;
            if(target < arr[mid]){
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return end;
    }
}
