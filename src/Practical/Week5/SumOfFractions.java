package Practical.Week5;

import java.util.Scanner;

public class SumOfFractions {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter till where you want the sum: ");
        int n = in.nextInt();
        double i;
        double sum=1,s;
        System.out.print("1/1");
        for(i=2;i<=n;i++){
            System.out.print("+"+"1/"+i);
            s=1/i;
            sum=sum+s;
        }
        System.out.println();
        System.out.println("The sum is: "+ sum);
    }
}
