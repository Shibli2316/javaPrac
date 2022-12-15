package Practical.Week3;

import java.util.Scanner;

public class Add {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the first number");
        int num1 = in.nextInt();
        System.out.println("Enter the next number");
        int num2 = in.nextInt();
        int sum = num1+num2;
        System.out.println("The sum of " + num1 + " and " + num2 + " is " +sum);
    }
}
