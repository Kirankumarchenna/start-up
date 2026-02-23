package org.practice.DSA.searching.linearSearch;

import java.util.Arrays;

public class maxIn2DArray {
    public static void main(String[] args) {
        int[][] arr = {
                {3, 4, 5, 6, 8, 9, 0},
                {7, 67, 78, 2, 1},
                {1, 2, 45, 5, 6, 7, 7},
                {1}
        };

        int target = 2;
        int result = max(arr);

        System.out.println(result);
    }

    static int max(int[][] arr){
        int max = arr[0][0];
        for(int row=0; row < arr.length; row++){
            for(int col=0; col<arr[row].length; col++){
                if(max < arr[row][col]){
                    max = arr[row][col];
                }
            }
        }
        return max;
    }
}
