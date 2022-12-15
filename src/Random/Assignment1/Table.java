package Random.Assignment1;

import java.util.Scanner;

public class Table {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number whose table you want to be printed: ");
        int num = in.nextInt();
        for( int i=1; i<11; i++){
            System.out.println(num + " x " + i + " = " + (num*i));
        }
    }
}
