package Practical.Week6;

import java.util.Arrays;
import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[5];
        for (int i = 0; i<arr.length; i++){
            System.out.println("Enter the number for "+ (i+1) + " index");
            arr[i] = in.nextInt();
        }
        System.out.println("The array that you made is: " + Arrays.toString(arr));
        int temp = arr[0];
        arr[0] = arr[arr.length-1];
        arr[arr.length-1]=temp;
        System.out.println("After swapping the last two elements we get: " + Arrays.toString(arr));
    }
}
