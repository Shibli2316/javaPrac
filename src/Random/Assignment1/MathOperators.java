package Random.Assignment1;

import java.util.Scanner;

public class MathOperators {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = in.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = in.nextInt();
        System.out.println("The sum of the numbers is: " + (num1+num2));
        System.out.println("The difference of the numbers is: " + (num1-num2));
        System.out.println("The product of the numbers is: " +num1*num2);
        System.out.println("The modulo of the numbers is: " + (num1%num2));
        if (num2!=0){
        System.out.println("The division of the numbers give: " +num1/num2);
        }
    }
}
