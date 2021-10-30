package Payments;

public class PayPalPaymentStrategy implements Payment {
    @Override
    public void pay(double price) {
        System.out.println("You successfully payed using PayPal");
    }
}
