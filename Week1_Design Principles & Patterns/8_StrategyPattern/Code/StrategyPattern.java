public interface PaymentStrategy {
    void pay(int amount);

}
public class CreditCardPayment implements PaymentStrategy{
    private String cardNum;
    public CreditCardPayment(String cardNumber) {
        this.cardNum = cardNumber;
    }
    @Override
    public void pay(int amount) {
        System.out.println(" Paid Rs." + amount + " using Credit Card ending in " + cardNum.substring(cardNum.length() - 4));
    }
}
public class PayPalPayment implements PaymentStrategy{
    private String email;
    public PayPalPayment(String email) {
        this.email = email;
    }
    @Override
    public void pay(int amount) {
        System.out.println(" Paid Rs." + amount + " using PayPal account: " + email);
    }
}
public class PaymentContext {
    private PaymentStrategy strategy;

    public void setPaymentStrategy(PaymentStrategy strategy)
    {
        this.strategy = strategy;
    }
    public void payAmount(int amount) {
        if (strategy == null) {
            System.out.println(" Payment strategy not set!");
        } else {
            strategy.pay(amount);
        }
    }
}
public class Main {
    public static void main(String[] args) {
        PaymentContext context = new PaymentContext();
        context.setPaymentStrategy(new CreditCardPayment("1234567890123456"));
        context.payAmount(1000);
        context.setPaymentStrategy(new PayPalPayment("user@Ankita.com"));
        context.payAmount(1500);
    }
}
