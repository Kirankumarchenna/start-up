package org.practice.DSA.searching.binarySearch.leetcode;
/*
    simply mountain array is known as Biotonic array
    https://leetcode.com/problems/peak-index-in-a-mountain-array/description/
    Q. Peak index in the mountain array
 */
public class MountainArrray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5, 6, 5, 4, 3};
        int index = peakIndexInAMountainArray(arr);
        System.out.println(index);
    }

    static int peakIndexInAMountainArray(int[] arr){
        int start = 0;
        int end = arr.length-1;

        while(start < end){
            int mid = start + (end - start) / 2;

            if(arr[mid] > arr[mid+1]){
                /*new we are in descending order of the hill part, so the mid-value might be the answer, and also we
                  need to check left side of this value whether there is any greater value than this value
                 */
                end = mid;
            } else {
                /*
                    so we are moving the start value one by one until it reaches to mid-value,
                    loop will break when the start == mid.
                 */
                start = mid + 1;
            }
        }
        return start;
    }
}
