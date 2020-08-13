package com.company;

import java.util.Scanner;

public class answer16 {
    public static void main(String args []){
        System.out.println("Please print your number :- ");
        Scanner num = new Scanner(System.in);
        int num1 = num.nextInt();

        int num2 = num1*100;
        System.out.println("Multiplication of your number with 100 is :- " + num2);
    }
}
