package Order;

public enum QuickOrder {
    ROSE_BUCKET, TULIP_BUCKET, CHAMOMILE_BUCKET;

    public Order createOrder(QuickOrder quickOrder) {
        Order order = new Order();
        return order;
    }
}
