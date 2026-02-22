package org.example.DSA.BasicOne;

public class Max {

    public static void main(String[] args) {
        int[] arr = {1, 32, 45, 2, 46};
        System.out.println(max(arr));

        System.out.println(maxInRange(arr, 1, 3));
    }

    static int max(int[] arr){
        int max = arr[0];
/*        for(int i = 0; i < arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }*/
        for(int i : arr){
            if(i > max){
                max = i;
            }
        }
        return max;
    }

    static int maxInRange(int[] arr, int start, int end){

        if(end > start){
            return -1;
        }

        if(arr == null){
            return -1;
        }

        int max = arr[start];
        for(int i = start; i < end; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }
}
