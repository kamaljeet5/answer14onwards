package com.company;

import java.util.Scanner;

public class answer18 {
    public static void main(String args []){
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your number :- ");
        int num = scan.nextInt();

        if (num%5==0){
            System.out.println("Your number is divisible by 5.");
        } else {
            System.out.println("Your number is not divisible by 5.");
        }
    }
}
