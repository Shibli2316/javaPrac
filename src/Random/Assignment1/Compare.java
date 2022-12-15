package Random.Assignment1;

import java.util.Scanner;

public class Compare {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = in.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = in.nextInt();
        if(num1>num2){
            System.out.println("Number 1 is greater");
        }else if(num1<num2){
            System.out.println("Number 2 is greater");
        }else{
            System.out.println("Both numbers are equal");
        }
    }
}
