package Practical.Week11;

public class Q2 {
    public static void main(String args[]) {
        Saving1 s1 = new Saving1();
        s1.takeLoans();

        Current1 c1 = new Current1();
        c1.takeLoans();
    }
}

interface Account1{
    default void takeLoans(){
        System.out.println("Taking Loans");
    }
}

class Saving1 implements Account1{
    public void takeLoans(){
        System.out.println("Loan Taken");
    }
}
class Current1 implements Account1{
    public void takeLoans(){
        System.out.println("Loan Taken");
    }
}