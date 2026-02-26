package org.practice.DSA.searching.binarySearch.leetcode;

/*
    Q.410. Split Array Largest Sum
    https://leetcode.com/problems/split-array-largest-sum/
 */

public class splitArray {
    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5};
        int k = 2;

        System.out.println(splitArray(arr, k));
    }

    static int splitArray(int[] nums, int k) {
        int start = 0;
        int end = 0;

        for (int i = 0; i < nums.length; i++) {
            start = Math.max(start, nums[i]); //in the end of loop this will contain the max item from the array
            end += nums[i];
        }

        while(start < end){
            //try for the middle as potential ans
            int mid = start + (end - start) / 2;

            //calculate how many pieces you can divide with this max sum
            int sum = 0;
            int pieces = 1;
            for(int num : nums){
                if(sum + num > mid){
                    //you cannot add this in subarray, make new one
                    //say you add this num in new subarray, then sum == num
                    sum = num;
                    pieces++;
                }
                else {
                    sum += num;
                }
            }

            if(pieces > k){
                start = mid + 1;
            } else {
                end = mid;
            }
        }
        return end; //here start == end
    }

}