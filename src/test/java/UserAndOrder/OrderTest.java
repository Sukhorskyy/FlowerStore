package UserAndOrder;

import Order.Order;
import Order.QuickOrder;
import User.User;
import User.Sender;
import User.Receiver;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class OrderTest {
    Order order;
    User sender1;
    User sender2;
    User receiver1;
    User receiver2;
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    @BeforeEach
    void setUp() {
        order = new Order();
        sender1 = new Sender();
        sender2 = new Sender();
        receiver1 = new Receiver();
        receiver2 = new Receiver();
        order.addUser(sender1);
        order.addUser(sender2);
        order.addUser(receiver1);
        order.addUser(receiver2);
        System.setOut(new PrintStream(outputStreamCaptor));
    }

    @Test
    void testAddUser() {
        assertEquals("[Sender(id=3), Sender(id=5), Receiver(id=2), Receiver(id=4)]", order.getUsers().toString());
    }

    @Test
    void testRemoveUser() {
        order.removeUser(sender2);
        assertEquals(3, order.getUsers().size());
    }

    @Test
    void testNotify() {
        order = new Order();
        sender1 = new Sender();
        order.addUser(sender1);
        order.notifyUser();
        assertEquals("Your order is sent", outputStreamCaptor.toString().trim());
    }

    @Test
    void testOrder() {
        testNotify();
    }

    @Test
    void testQuickOrder() {
        order = new Order(QuickOrder.ROSE_BUCKET);
        order = new Order(QuickOrder.TULIP_BUCKET);
        order = new Order(QuickOrder.CHAMOMILE_BUCKET);
    }
}