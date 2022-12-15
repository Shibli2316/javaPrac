package Practical.Week5;

import java.util.Arrays;
import java.util.Scanner;

public class SumOfArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("How many numbers do you want to put in the array:");
        int how = in.nextInt();
        int[] arr = new int[how];
        for (int i = 0; i<arr.length; i++){
            System.out.println("Enter the " + (i+1)+ " number");
            arr[i] = in.nextInt();
        }
        System.out.println("The array is: " + Arrays.toString(arr));
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
        }
        System.out.println("The sum turns out to be: " + sum);
    }
}
