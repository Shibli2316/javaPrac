package Practical.Week9;

public class Q5 {
    public static void main(String args[]) {
        Saving s1 = new Saving(1, "XYZ", "ABC Street",3000);
        s1.deposit();
        s1.withdraw();
        Accounts.calculateSimpleInterest();
        Accounts.calculateCompoundInterest();
        Current c1 = new Current(1, "XYZ", "ABC Street",50000);
        s1.deposit();
        s1.withdraw();
        Accounts.calculateSimpleInterest();
        Accounts.calculateCompoundInterest();
    }
}

class Saving extends Accounts{
    int min_balance;

    public Saving(int id, String Account_holder_name, String Address,int min_balance) {
        super(id, Account_holder_name, Address);
        this.min_balance = min_balance;
    }

    void display(){
        System.out.println("The id is: "+id+". The acc holder is: "+Account_holder_name+". The address is: "+Address+". The min balance is: "+min_balance);
    }
    void deposit(){
        System.out.println("Money Depositing");
    }
    void withdraw(){
        System.out.println("Money Withrawling");
    }
}
class Current extends Accounts{
    int max_withdrawl_limit;

    public Current(int id, String Account_holder_name, String Address,int max_withdrawl_limit) {
        super(id, Account_holder_name, Address);
        this.max_withdrawl_limit = max_withdrawl_limit;
    }

    void display(){
        System.out.println(id+"---"+Account_holder_name+"---"+Address+"---"+max_withdrawl_limit);
    }
    void deposit(){
        System.out.println("Money Deposited");
    }
    void withdraw(){
        System.out.println("Money Withrawled");
    }
}
