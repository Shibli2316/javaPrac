package Random.Assignment1;

import java.util.Arrays;
import java.util.Scanner;

public class PrimeArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("You have to enter 10 numbers");
        int[] arr = new int[5];
        for (int i = 0; i<arr.length; i++){
            System.out.println("Enter the number for "+ (i+1) + " index");
            arr[i] = in.nextInt();
        }
        System.out.println("The array is: "+ Arrays.toString(arr));

        int count = 0;
        for(int i = 0; i<arr.length; i++){
            if (arr[i] == 0 || arr[i] == 1) {
                System.out.println(arr[i] + " is neither prime nor a composite number");
            }
            else {
                for (int j = 2; j < arr[i]; j++) {
                    if (arr[i] % j == 0) {
                        System.out.println(arr[i] + " is not a prime number");
                        count = 1;
                        break;
                    }
                }
                if (count == 0) {
                    System.out.println(arr[i] +" is a prime number");
                }
            }
            count = 0;
        }
    }
}
