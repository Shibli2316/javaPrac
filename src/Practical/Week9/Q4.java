package Practical.Week9;

abstract class Accounts {

    int id;
    String Account_holder_name;
    String Address;

    Accounts(int id, String Account_holder_name, String Address) {
        this.id = id;
        this.Account_holder_name = Account_holder_name;
        this.Address = Address;
    }

    abstract void deposit();

    abstract void withdraw();

    static void calculateSimpleInterest() {
        System.out.println("No Simple interest");
    }

    static void calculateCompoundInterest() {
        System.out.println("No Compound interest");
    }
}