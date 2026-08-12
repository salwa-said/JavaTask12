package Task426and427and428and429;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //Task428
        List<Payment> payments = new ArrayList<>();

        payments.add(new CashPayment());
        payments.add(new CardPayment());
        payments.add(new PayPalPayment());

        for (Payment p : payments) {
            p.process();
        }

        //Task426 and 427

        CashPayment cp= new CashPayment();
        CardPayment card = new CardPayment();
        PayPalPayment paypal = new PayPalPayment();

        cp.process();

        //Task 429

        // Overloaded methods
        cp.accept("100 OMR");
        cp.accept(987654321L);
        cp.accept(42);
        card.process();
        paypal.process();
    }
}
