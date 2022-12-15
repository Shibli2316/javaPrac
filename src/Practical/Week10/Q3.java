package Practical.Week10;

public class Q3 {
    public static void main(String args[]) {
        Calculator c1 = new Calculator();
        c1.minMaxAdd(10, 35);
        c1.minMaxAdd(56.2, 29.5);
        c1.minMaxAdd("Hello", "World");
    }
}

class Calculator{
    public void minMaxAdd(int a,int b){
        int add = a + b;
        System.out.println(a+"+"+b+"="+add);
        if(a>b){
            System.out.println(a+" is maximum.");
            System.out.println(b+" is minimum.");
        }
        else{
            System.out.println(b+" is maximum.");
            System.out.println(a+" is minimum.");
        }
    }
    public void minMaxAdd(double a,double b){
        double add = a + b;
        System.out.println(a+"+"+b+"="+add);
        if(a>b){
            System.out.println(a+" is maximum.");
            System.out.println(b+" is minimum.");
        }
        else{
            System.out.println(b+" is maximum.");
            System.out.println(a+" is minimum.");
        }
    }
    public void minMaxAdd(String a,String b){
        String add = a + b;
        System.out.println(a+"+"+b+"="+add);
        int len1 =a.length();
        int len2 = b.length();
        if(len1>len2){
            System.out.println("maximum: "+a);
            System.out.println("minimum: "+b);
        }
        else{
            System.out.println("maximum: "+a);
            System.out.println("minimum: "+b);
        }
    }

}
