package Random.Assignment1;

import java.util.Arrays;
import java.util.Scanner;

public class EvenOddArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[5];
        int countEven = 0;
        int countOdd = 0;
        for (int i = 0; i<arr.length; i++){
            System.out.println("Enter the number for "+ (i+1) + " index");
            arr[i] = in.nextInt();
        }
        System.out.println("The array is: " + Arrays.toString(arr));
        for (int j = 0; j<arr.length; j++){
            if (arr[j]%2==0){
                countEven++;
            }
            else{
                countOdd++;
            }
        }
        System.out.println("The number of Even numbers in the array is: "+ countEven + ". And the number of odd numbers are: " + countOdd);
    }
}
