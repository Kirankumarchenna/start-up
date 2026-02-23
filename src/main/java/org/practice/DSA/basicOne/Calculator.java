package org.practice.DSA.basicOne;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int ans = 0;
        while(true){
            System.out.print("Enter your operand: ");
            char op = sc.next().trim().charAt(0);
            if(op == '+' || op == '-' || op == '*' || op == '/' || op == '%'){
                System.out.print("Enter your inputs: ");
                int num1 = sc.nextInt();
                int num2 = sc.nextInt();

                if(op == '+'){
                    ans = num1 + num2;
                }

                if(op == '-'){
                    ans = num1 - num2;
                }

                if(op == '*'){
                    ans = num1 * num2;
                }

                if(op == '/'){
                    if(num2 != 0) {
                        ans = num1 / num2;
                    }
                }

                if(op == '%'){
                    ans = num1 % num2;
                }
            } else if (op == 'X' || op == 'x'){
                break;
            } else {
                System.out.println("Invalid Operation");
            }
            System.out.println("Your answer is: "+ ans);
        }
    }
}
