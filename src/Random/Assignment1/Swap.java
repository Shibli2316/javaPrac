package Random.Assignment1;

import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = in.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = in.nextInt();
        System.out.println("The numbers you entered are:\nNumber 1: " + num1 +"\nNumber 2: "+ num2);
        int temp = num2;
        num2 = num1;
        num1 = temp;
        System.out.println("The numbers after being swapped are:\nNumber 1: " + num1 +"\nNumber 2: "+ num2);
    }
}
