package com.company;

import java.util.Scanner;

public class answer19 {
    public static void main(String args []){
        System.out.println("Please enter your number :- ");
        Scanner scan = new Scanner(System.in);
        long s = scan.nextLong();
        long squar = s*s;
        System.out.println("Square of your number is :- " + squar);
    }
}
