package SelfArrayPractice;

import java.util.Arrays;
import java.util.Scanner;

public class Basics {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of elements you want in your array");
        int num = in.nextInt();
        int[] arr = new int[num];
        for (int i = 0; i < num ; i++){
            System.out.println("Enter the number at " +(i+1)+ " index");
            arr[i] = in.nextInt();
        }
        System.out.println("Your array is ");
        System.out.println(Arrays.toString(arr));

        for(int i: arr){
            System.out.println(i);
        }
    }
}
