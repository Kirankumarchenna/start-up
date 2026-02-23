package org.practice.DSA.leetCodeProbs;

public class MaxWealth {
    public static void main(String[] args) {
        int[][] arr = {
                {23, 45, 67},
                {12, 45, 32},
                {12, 89, 56, 78}
        };
        System.out.println(maxWealth(arr));
    }

    static int maxWealth(int[][] accounts) {
        int ans = Integer.MIN_VALUE;
/*        for(int person = 0; person < accounts.length; person++){
            int sum = 0;
            for(int account = 0; account < accounts[person].length; account++){
                sum += accounts[person][account];
            }
            if(sum > ans){
                ans = sum;
            }
        }*/

        for(int[] person : accounts){
            int sum = 0;
            for(int account : person){
                sum += account;
            }
            if(sum > ans){
                ans = sum;
            }
        }
        return ans;
    }
}
