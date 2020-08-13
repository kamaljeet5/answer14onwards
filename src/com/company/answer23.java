package com.company;

import java.util.Scanner;

public class answer23 {
    public static void main(String args []){
        System.out.println("Please enter your number :- ");
        Scanner num = new Scanner(System.in);
        int num1 = num.nextInt();
        if (num1%2==0) {
            System.out.println("Your number is even");
        } else {
            System.out.println("Your number is odd");
        }
    }
}
