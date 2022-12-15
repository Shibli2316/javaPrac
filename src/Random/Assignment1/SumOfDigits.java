package Random.Assignment1;

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number whose digits you want to add: ");
        int num = in.nextInt();
        int sum = 0;
        while (num!=0){
            sum+= num%10;
            num =num/10;
        }
        System.out.println(sum);
    }
}
