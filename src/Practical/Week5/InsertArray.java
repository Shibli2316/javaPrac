package Practical.Week5;

import java.util.Arrays;
import java.util.Scanner;

public class InsertArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[10];
        int put=10;
        for (int i = 0; i< arr.length; i++){
            arr[i] = put;
            put+=10;
        }
        System.out.println(Arrays.toString(arr));
    }
}
