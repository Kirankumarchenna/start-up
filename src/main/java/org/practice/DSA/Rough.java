package org.practice.DSA;

import java.util.Arrays;

public class Rough {
    public static void main(String[] args) {
        int[] arr = {23, -34, 0, 11, 45, 787, 8988891};

        selection(arr);
        System.out.println(Arrays.toString(arr));;

    }

    static void selection(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            int last = arr.length - i - 1;
            int max = maxElement(arr, 0, last);

            int temp = arr[max];
            arr[max] = arr[last];
            arr[last] = temp;
        }
    }

    static int maxElement(int[] arr, int start, int end){
        int max = 0;
        for(int i = start; i <= end; i++){
            if(arr[max] < arr[i]){
                max = i;
            }
        }
        return max;
    }


}
