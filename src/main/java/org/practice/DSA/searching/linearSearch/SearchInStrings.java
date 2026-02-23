package org.practice.DSA.searching.linearSearch;

public class SearchInStrings {
    public static void main(String[] args) {
        String s = "kiran";
        char target = 'a';

        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == target){
                System.out.println(i);
            }
        }

        for(char ch : s.toCharArray()){
            if(ch == target){
                System.out.println(ch);
            }
        }
    }
}
