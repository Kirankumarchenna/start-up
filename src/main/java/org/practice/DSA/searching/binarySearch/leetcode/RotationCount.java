package org.practice.DSA.searching.binarySearch.leetcode;

public class RotationCount {
    public static void main(String[] args) {
        int[] arr = {5, 6, 7, 8, 9, 0, 1, 2, 3, 4}; //original array {0, 1, 2, 3, 4, 5, 6, 7} so this array rotated 4 times as pivot is 7
        System.out.println(countRotations(arr));
    }

    static int countRotations(int[] arr){
        int pivot = findPivot(arr);
        return pivot + 1; //bcz the logic is pivot will rotate number of times and the position starts from 0 index so pivot + 1 => 4+1=count
    }

    //use this for non duplicates
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
