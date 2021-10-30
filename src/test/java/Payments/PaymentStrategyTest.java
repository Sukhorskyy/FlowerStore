package Payments;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class PaymentStrategyTest {
    Payment paymentStrategy;
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    @BeforeEach
    public void setUp() {
        System.setOut(new PrintStream(outputStreamCaptor));
    }

    @Test
    void testCreditCardPaymentStrategy() {
        paymentStrategy = new CreditCardPaymentStrategy();
        paymentStrategy.pay(90.8);
        assertEquals("You successfully payed with credit card", outputStreamCaptor.toString().trim());
    }

    @Test
    void testPayPalPaymentStrategy() {
        paymentStrategy = new PayPalPaymentStrategy();
        paymentStrategy.pay(90.8);
        assertEquals("You successfully payed using PayPal", outputStreamCaptor.toString().trim());
    }

}