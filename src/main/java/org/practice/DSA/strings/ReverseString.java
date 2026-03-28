package org.practice.DSA.strings;

public class ReverseString {
    public static void main(String[] args) {
        String s = "Kiran kumar chenna";
        StringBuilder rev = new StringBuilder();

        for(int i = s.length() - 1; i >= 0; i--){
            rev.append(s.charAt(i));
        }
        System.out.println(rev);
    }
}
