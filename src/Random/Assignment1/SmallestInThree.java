package Random.Assignment1;

import java.util.Scanner;

public class SmallestInThree {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = in.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = in.nextInt();
        System.out.print("Enter the third number: ");
        int num3 = in.nextInt();
        if(num1<num2){
            if(num1<num3){
                System.out.println(num1+" is the smallest");
            }
            else if(num3<num2){
                System.out.println(num3+" is smallest");
            }
        }
        else if(num2<num3){
            System.out.println(num2 +" is smallest");
        }else{
            System.out.println(num3+ " is smallest");
        }
    }
}
