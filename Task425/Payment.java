package Task425;

public class Payment {
    private double amount;


    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        if (amount >= 0) {
            this.amount = amount;
        } else {
            this.amount = 0;
            System.out.println("amount cannot be negative.");
        }
    }
}

