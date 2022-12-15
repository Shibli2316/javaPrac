package Random.Assignment2;

import java.util.Arrays;
import java.util.Scanner;

public class Insertion {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of elements you want in the array:");
        int num = in.nextInt();
        int[] arr = new int[num];
        for (int i = 0; i < num; i++) {
            System.out.println("Enter the number for "+ (i+1) + " index");
            arr[i] = in.nextInt();
        }
        System.out.println("The array you made is: "+Arrays.toString(arr));
        System.out.println("Enter the index where you want to insert a number");
        int index = in.nextInt();
        System.out.println("Enter the number you want to insert:");
        int number = in.nextInt();
        int[] arrcpy = new int[num+1];
        if(index>num){
            System.out.println("Index out of bound");
        }else{
            for(int i = 0, k = 0; i<arr.length; i++){
                if(index==i){
                    arrcpy[k++] = number;
                }
                arrcpy[k++] = arr[i];
            }
        System.out.println("The new array is: " +Arrays.toString(arrcpy));
        }
    }
}
