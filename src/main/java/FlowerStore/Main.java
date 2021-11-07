package FlowerStore;

import Order.Order;
import Order.QuickOrder;
import User.User;
import User.Sender;
import User.Receiver;

public class Main {
    public static void main(String[] args) {
        Order order = new Order();
        User sender1 = new Sender();
        order.addUser(sender1);
        User sender2 = new Sender();
        order.addUser(sender2);
        System.out.println(sender1.getId());
        System.out.println(sender2.getId());

        User receiver1 = new Receiver();
        order.addUser(receiver1);
        User receiver2 = new Receiver();
        order.addUser(receiver2);
        System.out.println(receiver1.getId());
        System.out.println(receiver2.getId());

        System.out.println(order.getUsers());
        order.removeUser(sender2);
        System.out.println(order.getUsers());

        order.notifyUser();

        Order quickOrder = new Order(QuickOrder.CHAMOMILE_BUCKET);
    }
}
