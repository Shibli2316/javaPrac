package Random.Assignment2;

import java.util.Arrays;
import java.util.Scanner;

public class Deletion {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of elements you want in your array:");
        int num = in.nextInt();
        int[] arr = new int[num];
        for (int i = 0; i < num; i++) {
            System.out.println("Enter the element for " + (i+1) + " index");
            arr[i] = in.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("Enter the index you want to delete");
        int number = in.nextInt();
        if(number>num){
            System.out.println("Index out of bound");
        }else{
            int[] arrcpy = new int[arr.length-1];
            for(int i =0, k = 0; i<arr.length; i++){
                if(number==i){
                    continue;
                }
                arrcpy[k++]=arr[i];
            }
            System.out.println("After deletion the array is: " + Arrays.toString(arrcpy));
        }
    }
}