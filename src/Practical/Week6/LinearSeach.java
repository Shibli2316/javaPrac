package Practical.Week6;

import java.util.Arrays;
import java.util.Scanner;

public class LinearSeach{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter how many numbers you want in array: ");
        int how = in.nextInt();
        int[] nums = new int[how];
        for (int i = 0; i<how; i++){
            System.out.println("Enter the value for " + (i+1) + " number");
            nums[i] = in.nextInt();
        }
        System.out.println("The array is: "+Arrays.toString(nums));
        System.out.println("Enter the number you want to check for:");
        int target = in.nextInt();
        int ans = linearSearch(nums, target);
        System.out.println("The number is at index: "+(ans+1));
    }
    static int linearSearch(int[] arr, int target){
        if (arr.length==0){
            return -1;
        }
        for (int index = 0; index < arr.length; index++) {
            int element = arr[index];
            if(element==target){
                return index;
            }
        }
        return -1;
    }
//
//    static int linearSearch2(int[] arr, int target){
//        if (arr.length==0){
//            return -1;
//        }
//        for (int element: arr) {
//            if (element == target) {
//                return element;
//            }
//        }
//        return -1;
//    }
//
//    static boolean linearSearch3(int[] arr, int target){
//        if (arr.length==0){
//            return false;
//        }
//        for (int index = 0; index < arr.length; index++) {
//            int element = arr[index];
//            if(element==target){
//                return true;
//            }
//        }
//        return false;
//    }
}
