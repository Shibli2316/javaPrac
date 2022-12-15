package Recursions;

public class FiboNumber {
    public static void main(String[] args) {
        System.out.println("0, 1, 1, 2, 3, 5, 8, 13, ...");
        System.out.println(fibo(6));
    }
    static int fibo(int n){
//        base condition
        if(n<2){
            return n;
        }
        return fibo(n-1) + fibo(n-2);
    }
}
