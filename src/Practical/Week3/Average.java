package Practical.Week3;

import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        float num1 = in.nextFloat();
        System.out.print("Enter the second number: ");
        float num2 = in.nextFloat();
        System.out.print("Enter the third number: ");
        float num3 = in.nextFloat();
        float average = (num1+num2+num3)/3;
        System.out.println("The average of the numbers is: "+ average);
    }
}
