package org.practice.DSA.searching.binarySearch.leetcode;
/*Q find the position of an element in the infinite array
    trick: in normal binary search we will divide the large or full length array until it becomes 1 it becomes o(logN)
    but here why don't we start form small 1 and double the size of an array search until we find the target, bcz we don't
    know the array length as it is infinite here the same o(logN)
 */

public class FindPositionInInfiniteArray {
    public static void main(String[] args) {
        int[] arr = {3, 5, 7, 9, 10, 11, 34, 56, 78, 89, 98};
        int target = 10;
        System.out.println(ans(arr, target));
    }
    static int ans(int[] arr, int target){
        //first find the range
        //first start with a box of size 2
        int start = 0;
        int end = 1;

        while(target > arr[end]){
            int newStart = end + 1;
            //double the box value
            //end = previous end + size of box * 2
            end = end + (end - start + 1) * 2;
            start = newStart;
        }
        return binarySearch(arr, target, start, end);
    }

    static int binarySearch(int[] arr, int target, int start, int end){
        while(start <= end){
            int mid = start + (end - start) / 2;

            if(target < arr[mid]){
                end = mid - 1;
            } else if(target > arr[mid]){
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
