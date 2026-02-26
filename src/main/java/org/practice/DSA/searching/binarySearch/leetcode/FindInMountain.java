package org.practice.DSA.searching.binarySearch.leetcode;

public class FindInMountain {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 4, 3, 2};
        int[] arr2 = {1, 5, 2};
        int target = 2;

        int finalAns = search(arr2, target);
        System.out.println(finalAns);
    }

    static int search(int[] arr, int target){
        int peak = peakInMountain(arr);
        int firstTry = binarySearchOrderAgnostic(arr, target, 0, peak);
        if(firstTry != -1){
            return firstTry;
        }
        return binarySearchOrderAgnostic(arr, target, peak+1, arr.length-1);
    }

    static int binarySearchOrderAgnostic(int[] arr, int target, int start, int end){
        while(start <= end){
            int mid = start + (end - start) / 2;
            boolean isAsc = arr[start] < arr[end];

            if(target == arr[mid]){
                return mid;
            }

            if(isAsc){
                if(target < arr[mid]){
                    end = mid - 1;
                } else if (target > arr[mid]){
                    start = mid + 1;
                }
            }else{
                if(target > arr[mid]){
                    end = mid - 1;
                } else if(target < arr[mid]){
                    start = mid + 1;
                }
            }
        }
        return -1;
    }

    static int peakInMountain(int[] arr){
        int start = 0;
        int end = arr.length-1;

        while(start < end){
            int mid = start + (end - start) / 2;

            if(arr[mid] > arr[mid +1]){
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        return start;
    }


}
