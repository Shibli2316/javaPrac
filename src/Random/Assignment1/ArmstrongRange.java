package Random.Assignment1;

import java.util.Scanner;

public class ArmstrongRange {

        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            System.out.println("Enter the last number till where you want to check ");
            int till = in.nextInt();
            numberOfTimes(till);
        }

        private static void numberOfTimes(int till){
            for (int i = 1; i <= till; i++){
                int ans = armstrong(i);
                if(ans == i){
                    System.out.println(i + " is Armstrong");
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
