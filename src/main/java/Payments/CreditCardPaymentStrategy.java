package Payments;

public class CreditCardPaymentStrategy implements Payment{
    @Override
    public void pay(double price) {
        System.out.println("You successfully payed with credit card");
    }
}
