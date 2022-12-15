package Practical.Week7;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        System.out.println("The array is:");
        System.out.println(Arrays.toString(arr));
        System.out.println("Enter the number you wish to search for");
        int target = in.nextInt();
        System.out.println("The number is at the index " + search(arr, target, 0, arr.length-1));
    }

    static int search(int[] arr, int target, int s, int e){
        if(s>e){
            return -1;
        }
        int m = s + (e - s) / 2;
        if(arr[m] == target){
            return m;
        }
        if (target<arr[m]){
            return search(arr, target, s, m-1);
        }
        return search(arr, target, m+1, e);
    }
}
