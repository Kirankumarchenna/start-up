package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Sample {
    public static void main(String[] args) {
        List<Integer> arrayList = Arrays.asList(5, 6, 7, 9, 10);
        ArrayList<Integer> arrayList1 = new ArrayList<>();
        ArrayList<Integer> a;
        for(int i = 1; i<=10; i++){
            arrayList1.add(i);
        }
        System.out.println("ArrayList: "+arrayList1);

        for(int i = 1; i<arrayList1.size(); i++){
           arrayList1.set(i, arrayList1.get(i) +1);
        }
        System.out.println(arrayList1);
        System.out.println("Collection List: "+arrayList);
    }
}
