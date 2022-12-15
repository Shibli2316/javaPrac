package Random.Assignment2;

import java.util.Arrays;
import java.util.Scanner;

public class Majority {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of elements you want in your array:");
        int num = in.nextInt();
        int[] arr = new int[num];
        for (int i = 0; i < num; i++) {
            System.out.println("Enter the number at "+ (i+1) + " index");
            arr[i] = in.nextInt();
        }
        System.out.println("The array you made is " + Arrays.toString(arr));
        selection(arr);
        System.out.println("The majority element is "+arr[(num/2)]);
    }

    static void swap(int[] arr, int first, int second){
        int temp =  arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    static void selection(int[] arr){
        for (int i = 0; i<arr.length; i++){
            int last = arr.length - i - 1;
            int maxIndex = getMaxIndex(arr, 0, last);
            swap(arr, maxIndex, last);
        }
    }

    private static int getMaxIndex(int[] arr, int start, int end){
        int max =  start;
        for (int i = start; i<=end; i++){
            if (arr[max]<arr[i]){
                max = i;
            }
        }
        return max;
    }
}