package org.practice.DSA.basicOne;

import java.util.Arrays;
import java.util.Scanner;

public class MultiDimension {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
/*        int arr[][] = {
                {2, 3, 4},
                {4 ,1, 7, 8},
                {6, 7, 8}
        };*/
        int[][] arr = new int[3][4];

        for (int row = 0; row < arr.length; row++) {
            for (int column = 0; column < arr[row].length; column++) {
                arr[row][column] = sc.nextInt();
            }
        }

/*        for (int row = 0; row < arr.length; row++) {
            for (int column = 0; column < arr[row].length; column++) {
                System.out.print(arr[row][column]+" ");
            }
            System.out.println();
        }*/

/*        for(int i = 0; i< arr.length; i++){
            System.out.println(Arrays.toString(arr[i]));
        }*/

        for(int[] a : arr){
            System.out.println(Arrays.toString(a));
        }
    }
}
