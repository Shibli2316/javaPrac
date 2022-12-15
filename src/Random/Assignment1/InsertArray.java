package Random.Assignment1;

import java.util.Arrays;
import java.util.Scanner;

public class InsertArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("You have to enter 10 numbers");
        int[] arr = new int[10];
        for (int i = 0; i<10; i++){
            System.out.println("Enter the number for "+ (i+1) + " index");
            arr[i] = in.nextInt();
        }
        System.out.println(Arrays.toString(arr));
    }
}
