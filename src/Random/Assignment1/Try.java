package Random.Assignment1;

import java.util.Scanner;

public class Try{

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number ");
        int num = in.nextInt();
        System.out.println("Enter the last number");
        int till = in.nextInt();
        int ans = armstrong(num);
        if(ans == num){
            System.out.println("Armstrong");
        }
        else{
            System.out.println("Not");
        }
        numberOfTimes(till);
    }

    private static void numberOfTimes(int till){
        for (int i = 1; i <= till; i++){
            int ans = armstrong(i);
            if(ans == i){
                System.out.println("Armstrong");
            }
            else{
                System.out.println("Not");
            }
        }
    }

    private static int armstrong(int num) {
        int temp;
        double sum = 0;
        int digits = numberOfDigits(num);
        while(num>0){
            temp = num%10;
            sum += Math.pow(temp, digits);
            num /= 10;
        }
        return (int)sum;
    }

    private static int numberOfDigits(int num) {
        int count = 0;
        while(num>0){
            num /=10;
            count++;
        }
        return count;
    }
}