package org.practice.DSA.searching.linearSearch;

import java.lang.reflect.Array;
import java.util.Arrays;

public class searchIn2DArray {
    public static void main(String[] args) {
        int[][] arr = {
                {3, 4, 5, 6, 8, 9, 0},
                {7, 67, 78, 2, 1},
                {1, 2, 45, 5, 6, 7, 7},
                {1}
        };

        int target = 2;
        int[] result = search(arr, target);

        System.out.println(Arrays.toString(result));
    }

    static int[] search(int[][] arr, int target){
        for(int row=0; row < arr.length; row++){
            for(int col=0; col<arr[row].length; col++){
                if(arr[row][col] == target){
                    return new int[]{row, col};
                }
            }
        }
        return new int[]{-1, -1};
    }
}
