package org.practice.DSA.basicOne;

import java.util.ArrayList;
import java.util.Scanner;

public class Multidimen {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            list.add(new ArrayList<>());
        }
        System.out.println(list);

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                list.get(i).add(sc.nextInt());
            }
        }
        System.out.println(list);
    }
}
