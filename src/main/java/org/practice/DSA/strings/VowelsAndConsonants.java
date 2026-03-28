package org.practice.DSA.strings;

public class VowelsAndConsonants {
    public static void main(String[] args) {
        String s = "hello this is the main thing which you have to take care in interview";
        int vowels = 0, consonants = 0;

        for(char ch: s.toCharArray()){
            if("aeiou".indexOf(ch) != -1){
                vowels++;
            } else {
                consonants++;
            }
        }
        System.out.println("Vowels are: "+ vowels + " Consonants are: "+ consonants);
    }
}
