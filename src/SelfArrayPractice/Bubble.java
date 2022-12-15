package SelfArrayPractice;

import java.util.Arrays;
import java.util.Scanner;

public class Bubble {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[5];
        System.out.println("Enter the array");
        for (int i = 0; i < 5; i++) {
            arr[i] = in.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        BS(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void BS(int[] a){
//        boolean swapped = false;
        for (int i = 0; i < a.length; i++) {
            for (int j = 1 ; j < a.length-i; j++) {
                if(a[j-1]>a[j]){
                    int temp = a[j];
                    a[j] = a[j-1];
                    a[j-1] = temp;
                }
            }
        }
    }
}
