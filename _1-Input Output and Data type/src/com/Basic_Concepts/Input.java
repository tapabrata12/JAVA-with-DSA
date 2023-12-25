package com.Basic_Concepts;

import java.util.Scanner; // To take input we use Scanner class which is in the java.util packages

public class Input {
    // Reference: https://www.programiz.com/java-programming/scanner
    public static void main(String[] args){
        Scanner input = new Scanner(System.in); // This line tells us that we define a variable named input which takes input from keyboard new keyword tells to make a new class.


        // Integer Input
        System.out.print("Enter number: "); // Write something to tell the user.
        int a =  input.nextInt();
        System.out.println(a);    // We have to tell the user that taken value is what type without telling that it will through an error.

        // String Input
        System.out.print("Enter name: ");
        String b = input.nextLine();
        System.out.println(b);

        // Character Input
        System.out.print("Enter Character: ");
        String c = input.next();
        System.out.println(c);

        // Float Input
        System.out.print("Enter floating pt number: ");
        float d = input.nextFloat();
        System.out.println(d);
    }
}