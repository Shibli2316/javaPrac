package Random.Assignment1;

import java.util.Arrays;
import java.util.Scanner;

public class Inputsss {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[6];
        for (int i = 0; i<arr.length; i+=2){
            arr[i] = in.nextInt();
            arr[i+1] = 1234;
        }
        System.out.println(Arrays.toString(arr));
    }
}
