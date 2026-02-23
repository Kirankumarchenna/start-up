package org.practice.DSA.searching.linearSearch;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 6, 7, 1};
        int target = 20;
        System.out.println(linearSearch(arr, target));
    }

    static int linearSearch(int[] arr, int target){
        if(arr.length == 0){
            return -1;
        }

        for(int i=0; i<arr.length; i++){
            if(arr[i] == target){
                return i;
            }
        }
        return Integer.MAX_VALUE;
    }
}
