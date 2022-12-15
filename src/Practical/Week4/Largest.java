package Practical.Week4;

import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = in.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = in.nextInt();
        System.out.print("Enter the third number: ");
        int num3 = in.nextInt();
        if(num1>num2){
            if(num1>num3){
                System.out.println(num1+" is the largest");
            }
            else if(num3>num2){
                System.out.println(num3+" is largest");
            }
        }
        else if(num2>num3){
            System.out.println(num2 +" is largest");
        }else{
            System.out.println(num3+ " is largest");
        }
    }
}
