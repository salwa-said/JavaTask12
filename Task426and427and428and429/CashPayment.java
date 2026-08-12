package Task426and427and428and429;

public class CashPayment extends Payment {
    @Override
    public void process() {
        System.out.println("Processing cash payment.");
    }

    // Overloaded methods
    public void accept(String cashAmount) {
        System.out.println("Accepting cash amount: " + cashAmount);
    }

    public void accept(long chequeNumber) {
        System.out.println("Accepting cheque number: " + chequeNumber);
    }

    public void accept(int payOrder) {
        System.out.println("Accepting pay order ID: " + payOrder);
    }
}

