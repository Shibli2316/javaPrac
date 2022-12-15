package Hackathon;

import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int r = in.nextInt();
        int c = in.nextInt();
        int[][] arr= new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                arr[i][j] = in.nextInt();
            }
            System.out.println();
        }
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
        int count = 0;
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if(arr[i][j]==0 || arr[i][j]==1){
                    if( arr[i+1][j]==1 || arr[i-1][j] == 1 || arr[i][j+1] == 1 || arr[i+1][j]==0 || arr[i-1][j] == 0 || arr[i][j+1] == 0 ) {
                        count += 1;
                    }
                }
            }
        }
        System.out.println(count);
    }
}
