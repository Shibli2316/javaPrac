package Practical.Week5;

import java.util.Scanner;

public class Pattern {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("How many rows do you want: ");
        int rows = in.nextInt();
        int rowCount = 1;
        for (int i = rows; i > 0 ; i--) {
            for(int j = 1; j <= i*2; j++){
                System.out.print(" ");
            }
            for (int j = 1; j<=rowCount; j++){
                System.out.print(j+ " ");
            }
            for (int j = rowCount-1; j>=1; j--){
                System.out.print(j+ " ");
            }
            System.out.println();
            rowCount++;
        }
    }
}
