package com.company;

public class answer22 {
    public static void main(String args[]) {
        String line = "Apple is red and greaps are also red.";
        String word = "red";
        String temp[] = line.split(" ");
        int count = 0;
        for (int i = 0; i < temp.length; i++) {
            if (word.equals(temp[i]))
        count++;
    }
        System.out.println("The string is: " + line);
        System.out.println("The word " + word + " occurs " + count + " times in the above string");
    }
}

