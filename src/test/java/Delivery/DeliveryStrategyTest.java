package Delivery;

import FlowerStore.Flower;
import FlowerStore.FlowerType;
import FlowerStore.Item;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class DeliveryStrategyTest {
    Delivery deliveryStrategy;
    Item item;
    List<Item> itemList;
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    @BeforeEach
    public void setUp() {
        item = new Flower(FlowerType.TULIP);
        itemList = new ArrayList();
        itemList.add(item);
        System.setOut(new PrintStream(outputStreamCaptor));
    }

    @Test
    void testDHLDeliveryStrategy() {
        deliveryStrategy = new DHLDeliveryStrategy();
        deliveryStrategy.deliver(itemList);
        assertEquals("You successfully used DHL Delivery", outputStreamCaptor.toString().trim());
    }

    @Test
    void testPostDeliveryStrategy() {
        deliveryStrategy = new PostDeliveryStrategy();
        deliveryStrategy.deliver(itemList);
        assertEquals("You successfully used Post Delivery", outputStreamCaptor.toString().trim());
    }
}