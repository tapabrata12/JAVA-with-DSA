package com.Example_Programs;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        int num1,num2,sum;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number: ");
        num1 = input.nextInt();
        System.out.print("Enter second number: ");
        num2 = input.nextInt();
        sum = num1+num2;
        System.out.println("The sum "+num1+" + "+num2+" = "+sum);
    }
}
