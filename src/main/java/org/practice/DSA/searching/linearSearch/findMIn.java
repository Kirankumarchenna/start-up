package org.practice.DSA.searching.linearSearch;

public class findMIn {
    public static void main(String[] args) {
        int[] arr = {3, -7, 8, 9, 1, 89};
        int ans = arr[0];
        for(int i = 0; i<arr.length; i++){
            if(arr[i] < ans){
                ans = arr[i];
            }
        }

        for(int i: arr){
            if(i < ans){
                ans = i;
            }
        }
        System.out.println(ans);
    }
}
