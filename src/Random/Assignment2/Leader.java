package Random.Assignment2;

import java.util.Arrays;
import java.util.Scanner;

public class Leader {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of elements you want in the array: ");
        int num = in.nextInt();
        int[] arr = new int[num];
        for (int i = 0; i < num; i++) {
            System.out.println("Enter the element at "+ (i+1) + " index");
            arr[i] = in.nextInt();
        }
        System.out.println("Array: " + Arrays.toString(arr));
        System.out.print("The Leader elements are: ");
        Leader(arr, num);
    }

    public static void Leader(int[] arr, int size) {
        int max = arr[size - 1];
        for (int i = size - 1; i >= 0; i--) {
            if (max < arr[i]) {
                max = arr[i];
                System.out.print(max + " ");
            }
            else if (i == size - 1) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}