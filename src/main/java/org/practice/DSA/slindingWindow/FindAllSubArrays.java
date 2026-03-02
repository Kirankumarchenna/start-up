package org.practice.DSA.slindingWindow;

public class FindAllSubArrays {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};

        for (int k = 1; k <=arr.length; k++) {
            System.out.println("Sub Array of length: "+k);
            for(int pointer = 0; pointer < arr.length-k+1; pointer++){
                for (int i = pointer; i < pointer+k; i++) {
                    System.out.print(arr[i]+" ");
                }
                System.out.println();
            }
            System.out.println();
        }

    }
}
