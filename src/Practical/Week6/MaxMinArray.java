package Practical.Week6;

import java.util.Arrays;
import java.util.Scanner;

public class MaxMinArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of elements you want in your array");
        int num = in.nextInt();
        int[] arr = new int[num];
        for (int i = 0; i < num; i++) {
            System.out.println("Enter the number for " + (i+1) + " index");
            arr[i] = in.nextInt();
        }
        System.out.println("The array you made is ");
        System.out.println(Arrays.toString(arr));

        bubble(arr);

        System.out.println("The minimum number in the array is "+ arr[0]);
        System.out.println("The maximum number in the array is "+ arr[arr.length-1]);
    }

    static void bubble(int[] arr){
        boolean swapped;
        for (int i = 0; i < arr.length; i++) {
            swapped = false;
            for (int j = 1; j < arr.length-i; j++) {
                if (arr[j]<arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    swapped = true;
                }
            }
            if(!swapped){
                break;
            }
        }
    }
}
