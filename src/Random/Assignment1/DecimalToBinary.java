package Random.Assignment1;

import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number you want to convert to binary");
        int num = in.nextInt();

        int[] binary = new int[100];
        int i = 0;
        while(num>0){
            binary[i]=num%2;
            num = num/2;
            i++;
        }
        System.out.println("The Binary Number is: ");
        for(int j=i-1; j>=0; j--){
            System.out.print(binary[j]);
        }
    }
}
