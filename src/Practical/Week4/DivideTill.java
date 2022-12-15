package Practical.Week4;

import java.util.Scanner;

public class DivideTill {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = in.nextInt();
        int count = 0;
        while(num>10){
            num/=2;
            count++;
        }
        System.out.println("The number can be divided " + count + " times.");
    }
}
