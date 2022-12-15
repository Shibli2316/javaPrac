/*package whatever //do not write package name here */

import java.util.Scanner;

public class Basics {
    static int findSingle(int A[], int ar_size)
    {
        for (int i = 0; i < ar_size; i++) {
            int count = 0;

            for (int j = 0; j < ar_size; j++) {
                if (A[i] == A[j]) {
                    count++;
                }
            }
            if (count == 1) {
                return A[i];
            }
        }
        return -1;
    }

    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int[] ar = new int[num];
        for (int i = 0; i < num; i++) {
            ar[i] = in.nextInt();
        }
        int n = ar.length;
        if(findSingle(ar, n)>7){
            System.out.println(-1);
        }else{
            System.out.println(1);
        }
    }
}