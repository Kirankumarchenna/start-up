package org.practice.DSA.twoPointers.leetcode;

/*
    88. Merge Sorted Array
    https://leetcode.com/problems/merge-sorted-array/
 */

public class MergeSortedArray {
    public static void main(String[] args) {

    }

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] result = new int[m+n];

        int a = 0;
        int b = 0;
        int index = 0;

        while(a!=m && b!=n){
            if(nums1[a] <= nums2[b]){
                result[index] = nums1[a];
                a++;
            } else {
                result[index] = nums2[b];
                b++;
            }
            index++;
        }

        while(a<m){
            result[index] = nums1[a];
            index++;
            a++;
        }

        while(b<n){
            result[index] = nums2[b];
            index++;
            b++;
        }

        for (int i = 0; i < result.length; i++) {
            nums1[i] = result[i];   //push all the values from dummy array to our first array
        }
    }
}
