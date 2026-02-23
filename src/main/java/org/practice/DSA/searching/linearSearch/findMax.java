package org.practice.DSA.searching.linearSearch;

public class findMax {
    public static void main(String[] args) {
        int[] arr = {4, 5, 6, -1, 5, 78, 100};

        int ans = arr[0];
        for(int i=0; i<arr.length; i++){
            if(arr[i] > ans){
                ans = arr[i];
            }
        }
        System.out.println(ans);
    }
}
