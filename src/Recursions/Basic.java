package Recursions;

public class Basic {
    public static void main(String[] args) {
//        Write a function that prints  hello world
//        message();
        print(1);
    }

//    static void message() {
//        System.out.println("hello world");
//    }

    static void print(int n){
        if(n==5){
            System.out.println(5);
            return;
        }
        System.out.println(n);
        print(n+1);
    }
}
