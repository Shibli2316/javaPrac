package Practical.Week5;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        int ans = 1;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number whose factorial you want: ");
        int num = in.nextInt();
        if(num==1 || num==0){
            System.out.println("The factorial of "+ num + " is 1");
        }else if(num<0){
            System.out.println("Enter a positive number: ");
        }else{
            for (int i=1; i<num+1; i++){
                ans *= i;
            }
        }
        System.out.println("The factorial of the " +num + " is " + ans);
    }
}
