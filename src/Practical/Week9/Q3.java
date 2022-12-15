package Practical.Week9;

public class Q3 {
    public static void main(String args[]) {
        Account a1 = new Account(1, "XYZ", "ABC Street");
        a1.deposit();
        a1.withdraw();
        Account.calculateSimpleInterest();
        Account.calculateCompoundInterest();
    }
}

class Account {

    int id;
    String Account_holder_name;
    String Address;

    Account(int id, String Account_holder_name, String Address) {
        this.id = id;
        this.Account_holder_name = Account_holder_name;
        this.Address = Address;
    }

    void deposit() {
        System.out.println("You have deposited the money");
    }

    void withdraw() {
        System.out.println("You have withdrawn the money");
    }

    static void calculateSimpleInterest() {
        System.out.println("No Simple interest");
    }

    static void calculateCompoundInterest() {
        System.out.println("No Compound interest");
    }
}
