package Practical.Week4;

import java.util.Scanner;

public class SeriesSum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("The series is: 1, 2, 3, 4.....N");
        System.out.print("Enter the last number of the series: ");
        int num = in.nextInt();
        int sum = (num*(num+1))/2;
        System.out.println("The sum of the series till " + num + " is " + sum);
    }
}
