package Sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {0};
        selection(arr);
        System.out.println(Arrays.toString((arr)));
    }

    static void swap(int[] arr, int first, int second){
        int temp =  arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    static void selection(int[] arr){
        for (int i = 0; i<arr.length; i++){
//            Find the maximum item in the remaining array and swap with correct index
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
    static void bubble(int[] arr){
        boolean swapped;
//        Run the steps n-1 times
        for (int i = 0; i < arr.length; i++) {
            swapped = false;
//            for each step max item will come at respective index
            for (int j = 1; j < arr.length-i; j++) {
//                Swap
                if (arr[j]<arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    swapped = true;
                }
            }
//            if you did not swap for a particular value
            if(!swapped){
                break;
            }
        }
    }
}