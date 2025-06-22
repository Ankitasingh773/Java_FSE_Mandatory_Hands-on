public interface PaymentProcessor {
    void processPayment(double amount);
}
public class PayPal {
    public void sendPayment(double amount) {
        System.out.println("Payment of $" + amount + " through PayPal.");
    }
}
public class Stripe {
    public void makePayment(double amount) {
        System.out.println("Payment of $" + amount + " through Stripe.");
    }
}
public class PayPalAdapter implements PaymentProcessor{
    private PayPal payPal;
    public PayPalAdapter(PayPal payPal) {
        this.payPal = payPal;
    }
    @Override
    public void processPayment(double amount) {
        payPal.sendPayment(amount);
    }
}
public class StripeAdapter implements PaymentProcessor{
    private Stripe stripe;

    public StripeAdapter(Stripe stripe) {
        this.stripe = stripe;
    }
    @Override
    public void processPayment(double amount) {
        stripe.makePayment(amount);
    }
}
public class Main {
    public static void main(String[] args) {
        PaymentProcessor paypalPro = new PayPalAdapter(new PayPal());
        paypalPro.processPayment(250.00);
        PaymentProcessor stripePro = new StripeAdapter(new Stripe());
        stripePro.processPayment(500.00);
    }
}

