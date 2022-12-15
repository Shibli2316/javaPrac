package Arrayss;

import java.util.Arrays;
import java.util.Scanner;

public class Regret {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = {1,2,3,4,5};
        System.out.println("Enter the number you want to delete");
        int number = in.nextInt();
        System.out.println(Arrays.toString(arr));
        int[] arrcpy = new int[arr.length-1];
        for(int i =0, k = 0; i<arr.length; i++){
            if(number==i){
                continue;
            }
            arrcpy[k++]=arr[i];
        }
        System.out.println(Arrays.toString(arrcpy));
    }
}






















































