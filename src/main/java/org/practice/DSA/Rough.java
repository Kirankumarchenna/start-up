package org.practice.DSA;

import java.util.Arrays;

public class Rough {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};

        int index1 = 0;
        int lastIndex = arr.length-1;

        while(index1 < lastIndex){
            int temp = arr[index1];
            arr[index1] = arr[lastIndex];
            arr[lastIndex] = temp;

            index1++;
            lastIndex--;
        }
        System.out.println(Arrays.toString(arr));
    }
}
