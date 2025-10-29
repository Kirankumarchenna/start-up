package org.example.DSA;

import java.util.Arrays;
import java.util.Random;

public class LinearAndBinarySearch {
    public static void main(String[] args) {
        int[] nums = new int[1000];
        int target = 21;

        Random random = new Random();
        for (int i=0; i<nums.length; i++){
            nums[i] = random.nextInt(100);
        }

        int result = LinearSearch(nums, target);
        int result1 = BinarySearch(nums, target);

        if(result != -1) {
            System.out.println("In Linear the element found at index: " + result);
        } else {
            System.out.println("In Linear element not found");
        }

        if(result1 != -1){
            System.out.println("Binary the element found at index: " + result1);
        } else {
            System.out.println("In Binary element not found.");
        }

    }

    public static int LinearSearch(int[] nums, int target){
        int steps = 0;
        for(int i=0; i<nums.length; i++){
            steps++;
            if(nums[i]==target){
                System.out.println("Steps taken for LinearSearch: "+ steps);
                return i;
            }
        }
        System.out.println("Steps taken for Linear search: "+ steps);
        return -1;
    }

    public static int BinarySearch(int[] nums, int target){
        Arrays.sort(nums); //I have sorted because binary only accepts the sorting order.

        int left = 0;
        int right = nums.length-1;
        int steps = 0;

        while(left <= right){
            int mid = (left + right)/2;
            steps++;

            if(nums[mid] == target){
                System.out.println("Steps taken for Binary search: "+ steps);
                return mid;
            } else if (nums[mid] > target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        System.out.println("Steps taken for Binary search: "+ steps);
        return -1;
    }
}
