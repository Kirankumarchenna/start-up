package org.practice.DSA.twoPointers;

public class Palindrome {
    public static void main(String[] args) {
        String str = "abcddcba";
        System.out.println(palindrome(str));
    }

    static boolean palindrome(String str){
        if(str == null || str.isEmpty()){
            return true;
        }
        str = str.toLowerCase();
        for (int i = 0;  i < str.length() / 2 ; i++) {
            char start = str.charAt(i);
            char end = str.charAt(str.length() - 1 - i); //bcz end varies, should shift forward

                                            /*
                                                s s s s e e e e
                                                a b c d d c b a (pattern i used is two pointers - converging pointers)
                                            */
            if(start != end){
                return false;
            }
        }
        return true;
    }
}
