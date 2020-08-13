package com.company;

import java.util.Scanner;

public class answer17 {
    public static void main(String args []){
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter width of Traingle :- ");
        double width = scan.nextDouble();
        System.out.println("Please enter the height of Traingle :- ");
        double height = scan.nextDouble();
        Double area = (width*height)/2;

        System.out.println("Area of Triangle is :-  " + area);
    }
}
