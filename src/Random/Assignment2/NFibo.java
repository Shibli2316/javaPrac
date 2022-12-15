package Random.Assignment2;

import java.util.Scanner;

public class NFibo {

    public static int fibo(int n){
        if (n<=1){
            return n;
        }
        return fibo(n-2)+fibo(n-1);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the index at which you want the fibonacci number:");
        int num = in.nextInt();
        int fib = fibo(num);
        System.out.println("Fibonacci at the " + num + "th place is " + fib);
    }
}
