package Decorators;

import FlowerStore.Item;

public class RibbonDecorator extends ItemDecorator{
    public RibbonDecorator(Item item) {
        super(item);
    }

    @Override
    public double getPrice() {
        return 40 + super.getPrice();
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", Decorated with ribbon";
    }
}
