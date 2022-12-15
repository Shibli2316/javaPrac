package Random.Assignment3.Q5;

public class SBI extends Bank{
    public SBI(double minInterestRate) {
        super(minInterestRate);
    }

    public void calInterest(){
        System.out.println("Calculate Interest SBI");
    }

    public void showAnnualRevenue(){
        System.out.println("SBI show your revenue");
    }
}
