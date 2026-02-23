package org.practice.DSA.basicOne;

import java.util.Arrays;
import java.util.List;

public class Swap {

    public static void main(String[] args) {
        int[] arr = {3, 45, 65, 1, 9, 100};
        //swap(arr, 0, 5);
        //System.out.println(Arrays.toString(arr));

        List<Integer> list = Arrays.asList(2, 45, 654, 11, 56, 6, 76);
        //swapWithCollection(list, 2, 3);
        //System.out.println(list);

        reverseArray(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void swap(int[] arr, int index1, int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }

    static void swapWithCollection(List<Integer> list, int index1, int index2){
        int temp = list.get(index1);
        list.set(index1, list.get(index2));
        list.set(index2, temp);
    }

    static void reverseArray(int[] arr){
        /*
            Example
             s  s  s  e  e  e - Swap start and end
            {1, 2, 3, 4, 5, 6}
            {6, 5, 4, 3, 2, 1}
            start + 1 >>
            end - 1 <<

            this is known as two pointer method.
         */

      int start = 0;
      int end = arr.length-1;

      while(start < end){
          //swap(arr, start, end);

          int temp = arr[start];
          arr[start] = arr[end];
          arr[end] = temp;

          start++;
          end--;
      }
    }
}
