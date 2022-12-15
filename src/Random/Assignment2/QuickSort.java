package Random.Assignment2;

import java.util.Arrays;
import java.util.Scanner;

public class QuickSort {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter size for the array: ");
        int size = in.nextInt();
        int arr[] = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Enter elements at " + (i + 1) + " index");
            arr[i] = in.nextInt();
        }
        System.out.println("Unsorted Array: " + Arrays.toString(arr));
        quickSort(arr, 0, size - 1);
        System.out.println("Sorted Array: " + Arrays.toString(arr));
    }

    static int partition(int arr[], int low, int high) {
        int pivot = arr[high];
        int i = low - 1;
        for (int k = low; k < high; k++) {
            if (arr[k] < pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[k];
                arr[k] = temp;
            }
        }
        i++;
        int temp = arr[i];
        arr[i] = arr[high];
        arr[high] = temp;
        return i;
    }

    static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pidx = partition(arr, low, high);
            quickSort(arr, low, pidx - 1);
            quickSort(arr, pidx + 1, high);
        }
    }
}