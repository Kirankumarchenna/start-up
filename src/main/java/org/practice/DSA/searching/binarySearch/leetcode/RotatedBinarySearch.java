package org.practice.DSA.searching.binarySearch.leetcode;
/*
    33. Search in Rotated Sorted Array
    https://leetcode.com/problems/search-in-rotated-sorted-array/
 */

public class RotatedBinarySearch {
    public static void main(String[] args) {
        //int[] arr = {4, 5, 6, 7, 8, 9, 1, 2};
        int[] arr2 = {5, 1, 3, 5, 3};
        int target = 5;
        System.out.println(search(arr2, target));
    }

    static int search(int[] nums, int target) {
        int pivot = findPivotWithDuplicates(nums);
        //if you didn't find a pivot, it means the array is not rotated
        if(pivot == -1){
            return binarySearch(nums, target, 0, nums.length-1);
        }

        //if pivot has found you have found two ascending sorted arrays
        if(nums[pivot] == target){
            return pivot;
        }
        //if target is greater than the start element
        if(target >= nums[0]){
            return binarySearch(nums, target, 0, pivot-1);
        }
        //if target is less than the start element
        return binarySearch(nums, target, pivot+1, nums.length-1);

    }

    static int binarySearch(int[] arr, int target, int start, int end){
        while(start<=end){
            int mid = start + (end - start) / 2;

            if(target == arr[mid]){
                return mid;
            }

            if(target < arr[mid]){
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }

    //this logic wont work with duplicate values
    static int findPivot(int[] arr){
        int start = 0;
        int end = arr.length -1;

        while(start <= end){
            int mid = start + (end - start) / 2;
            if(mid < end && arr[mid] > arr[mid + 1]){
                return mid;
            }
            if(mid > start && arr[mid] < arr[mid - 1]){
                return mid - 1;
            }
            if(arr[mid] <= arr[start]){
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }

    //find pivot with duplicates
    static int findPivotWithDuplicates(int[] arr){
        int start = 0;
        int end = arr.length -1;

        while(start <= end){
            int mid = start + (end - start) / 2;
            if(mid < end && arr[mid] > arr[mid + 1]){
                return mid;
            }
            if(mid > start && arr[mid] < arr[mid - 1]){
                return mid - 1;
            }

            //if elements at middle, start, end are equal skip duplicates
            if(arr[mid] == start && arr[mid] == end){
                //eliminating duplicates
                //but what if start and ends are pivots? so first check
                if(arr[start] > arr[start+1]){
                    return start;
                }
                start++;

                //check whether end is pivot
                if(arr[end] > arr[end - 1]){
                    return end - 1;
                }
                end--;
            }
            //left side is sorted, so the pivot should be in right side
            else if (arr[start] < arr[mid] || arr[start] == arr[mid] && arr[mid] > arr[end]){
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }
}
