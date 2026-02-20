package org.example.DSA.BasicOne;

import java.util.Scanner;

public class CountNums {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        long n = 2673839233333333342L;
        int count = 0;
        while (n > 0) {
            int rem = (int) (n % 10);
            if (rem == input) {
                count++;
            }
            n = n / 10;
        }
        System.out.println("Your "+input+ " has "+count+" times");
    }
}
