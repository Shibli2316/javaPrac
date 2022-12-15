package Random.Assignment1;

import java.util.Arrays;
import java.util.Scanner;

public class SameElement {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[5];
        for (int i = 0; i<arr.length; i++){
            System.out.println("Enter the number for "+ (i+1) + " index");
            arr[i] = in.nextInt();
        }
        System.out.println("The array you made is: " +Arrays.toString(arr));
        if (arr[0]==arr[arr.length-1]){
            System.out.println("The first and last element of the array is same");
        }
        else{
            System.out.println("The first and last element is not the same");
        }
    }
}
