package org.example.DSA;

import java.util.Arrays;

public class RecursiveBinarySearch {

    public static int binarySearch(int[] nums, int target) {
        Arrays.sort(nums);
        return binarySearchRecursion(nums, target, 0, nums.length - 1);
    }

    public static int linearSearch(int[] nums, int target) {
        Arrays.sort(nums);
        return linearSearchRecursion(nums, target, 0);
    }


    public static int linearSearchRecursion(int[] nums, int target, int index) {
        if(index >= nums.length){
            return -1;
        }

        if(nums[index] == target){
            return index;
        }
        return linearSearchRecursion(nums, target, index+1);
    }

    public static int binarySearchRecursion(int[] nums, int target, int left, int right) {

        if (left > right) {
            return -1;
        }

        int mid = (left + right) / 2;

        if (nums[mid] == target) {
            return mid;
        } else if (nums[mid] > target) {
            return binarySearchRecursion(nums, target, left, mid - 1);
        } else {
            return binarySearchRecursion(nums, target, mid + 1, right);
        }
    }

    public static void main(String[] args) {
        int[] nums = {89, 12, 44, 55, 1}; //1, 12, 44, 55, 89
        int target = 12;

        if(binarySearch(nums, target) != -1 )
            System.out.println("Index values of binary search is: " + binarySearch(nums, target));
        else
            System.out.println("No index found in binary..");

        if(linearSearch(nums, target) != -1)
            System.out.println("Index values of linear search is: "+ linearSearch(nums, target));
        else
            System.out.println("No index found in linear..");
    }
}
