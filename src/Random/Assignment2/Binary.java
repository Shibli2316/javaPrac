package Random.Assignment2;

import java.util.Arrays;
import java.util.Scanner;

public class Binary {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of elements you want in your array");
        int num = in.nextInt();
        int[] arr = new int[num];
        for (int i = 0; i < num; i++) {
            System.out.println("Enter the element for " + (i+1) + " index");
            arr[i] = in.nextInt();
        }
        System.out.println("The array you made is: " + Arrays.toString(arr));
        System.out.println("Enter the number you want to find: ");
        int target = in.nextInt();
        int ans = search(arr, target, 0, arr.length-1);
        if(ans == -1){
            System.out.println("Element not found");
        } else{
            System.out.println("The element is at " + (ans+1) + " number");
        }
    }

    static int search(int[] arr, int target, int start, int end){
        if(start>end){
            return -1;
        }
        int mid = start + (end - start) / 2;
        if(arr[mid] == target){
            return mid;
        }
        if (target<arr[mid]){
            return search(arr, target, start, mid-1);
        }
        return search(arr, target, mid+1, end);
    }
}
