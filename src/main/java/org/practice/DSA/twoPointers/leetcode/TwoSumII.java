package org.practice.DSA.twoPointers.leetcode;

/*
    Q167 two sum 2 - input array is sorted
    https://leetcode.com/problems/two-sum-ii-input-array-is-sorted
 */
import java.util.Arrays;

public class TwoSumII {
    public static void main(String[] args) {
        int[] arr = {2, 7, 11, 15};
        int target = 9;
        System.out.println(Arrays.toString(twoSum(arr,target)));
    }

    static int[] twoSum (int[] nums, int target){

        int left = 0;
        int right = nums.length-1;

        while (left<right){
            if(nums[left]+nums[right] == target){
                return new int[]{left+1, right+1}; //+1 because he asked that the index has started from 1
            }
            if(nums[left]+nums[right] < target){
                left++;
            } else {
                right--;
            }
        }
        return new int[]{-1, -1};
    }
}
