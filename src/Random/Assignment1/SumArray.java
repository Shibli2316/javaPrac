package Random.Assignment1;

import java.util.Arrays;
import java.util.Scanner;

public class SumArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[5];
        int sum = 0;
        for (int i = 0; i<5; i++){
            System.out.println("Enter the number for "+ (i+1) + " index");
            arr[i] = in.nextInt();
        }
        System.out.println("The array you made is: "+Arrays.toString(arr));
        for (int i : arr) {
            sum += i;
        }
        System.out.println("The sum of the numbers of the array is: "+ sum);
    }
}
