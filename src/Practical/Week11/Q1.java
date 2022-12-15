package Practical.Week11;

public class Q1 {
    public static void main(String args[]) {
        Saving s1 = new Saving();
        s1.deposite();
        s1.withdraw();
        Account.aboutBank();

        Current c1 = new Current();
        c1.deposite();
        c1.withdraw();
        Account.aboutBank();
    }
}

interface Account{
    public void deposite();
    public void withdraw();
    static void aboutBank(){
        System.out.println("SBI BANK");
    }
}

class Saving implements Account{
    public void deposite(){
        System.out.println("Depositing in Saving");
    }
    public void withdraw(){
        System.out.println("Withdrawing from Saving");
    }
}
class Current implements Account{
    public void deposite(){
        System.out.println("Depositing in Current");
    }
    public void withdraw(){
        System.out.println("Withdrawing from Current");
    }
}