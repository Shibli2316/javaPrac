package Practical.Week3;

import java.util.Scanner;

public class Multiply {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the first number");
        float num1 = in.nextFloat();
        System.out.println("Enter the next number");
        float num2 = in.nextFloat();
        float ans = num1*num2;
        System.out.println("The product of "+ num1 + " and " + num2 + " is " + ans);
    }
}