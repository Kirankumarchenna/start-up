package org.practice.DSA.basicOne;

public class ArmstrongNumber {
    public static void main(String[] args) {

        for (int i = 100; i <= 1000; i++){ //three digit armstrong number
            if(armstrongNumber(i)){
                System.out.print(i+ " ");
            }
        }
    }
    public static boolean armstrongNumber(int num){
        int original = num;
        int sum = 0;
        while(num > 0){
            int rem = num%10;
            sum = sum + rem*rem*rem;
            num /= 10;
        }
        return sum == original;
    }
}
