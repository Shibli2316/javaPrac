package Random.Assignment1;

import java.util.Scanner;

public class IsPrime {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = in.nextInt();
        int count = 0;
        if (num == 0 || num == 1) {
            System.out.print(num + " is neither prime nor a composite number");
        }
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                System.out.println(num + " is not a prime number");
                count = 1;
                break;
            }
        }
        if (count == 0) {
            System.out.println(num + " is a prime number");
        }
    }
}