package Practical.Week3;

import java.util.Scanner;

public class Cube {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number whose cube you want");
        double num = in.nextDouble();
        double ans = Math.pow(num, 3);
        System.out.println("The cube of " + num + " is " +ans);
    }
}
