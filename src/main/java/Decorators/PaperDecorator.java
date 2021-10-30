package Decorators;

import FlowerStore.Item;

public class PaperDecorator extends ItemDecorator{
    public PaperDecorator(Item item) {
        super(item);
    }

    @Override
    public double getPrice() {
        return 13 + super.getPrice();
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", Decorated with paper";
    }
}
