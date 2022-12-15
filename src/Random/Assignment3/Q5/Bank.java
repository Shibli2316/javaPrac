package Random.Assignment3.Q5;

abstract class Bank implements RBI{

    double minInterestRate;

    public double getMinInterestRate() {
        return minInterestRate;
    }

    public void setMinInterestRate(double minInterestRate) {
        this.minInterestRate = minInterestRate;
    }

    public Bank(double minInterestRate) {
        this.minInterestRate = minInterestRate;
    }

    public abstract void calInterest();

    public abstract void showAnnualRevenue();

    public void display(){
        System.out.println("The interest rate is: "+ this.minInterestRate);
    }
}
