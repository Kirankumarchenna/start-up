package org.practice.DSA.leetCodeProbs;

public class EvenDigits {
    public static void main(String[] args) {
        int[] arr = {21, 34, 56755, 774, 23, 64};

        System.out.println(findNumbers(arr));
    }

    static int findNumbers(int[] nums){
        int count = 0;

        for(int num : nums){
            if(even(num)){
                count++;
            }
        }
        return count;
    }

    static boolean even(int num) {
        return noOfDigits(num) % 2 == 0;
    }

    static int noOfDigits(int num){
        int count = 0;

        if(num < 0){
            num = num * -1;
        }

        if(num == 0){
            return 1;
        }

        while(num > 0){
            count++;
            num = num/10;
        }
        return count;
    }
}
