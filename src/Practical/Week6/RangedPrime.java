package Practical.Week6;

import java.util.Scanner;

public class RangedPrime {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        for (int i = 0; i <= 100; i++) {
            int count = 0;
            if (i == 0 || i == 1) {
                continue;
            }
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    count = 1;
                    break;
                }
            }
            if (count == 0) {
                System.out.println(i + " is a prime number");
            }
        }
    }
}
