package org.practice;

public class Practice {

    public static void main(String[] args) {
        int[] nums = {2, 6, 4, 5, 8, 9};
        int second = 0;
        int first = 0;

        for(int i: nums){
            if(i > first){
                second = first;
                first = i;
            } else if(i > second && i != first){
                second = i;
            }
        }
        System.out.println(second);
    }

}
