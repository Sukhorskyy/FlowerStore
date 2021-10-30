package Decorators;

import FlowerStore.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DecoratorTest {
    Item bucket;
    Flower flower;
    FlowerPack flowerPack;

    @BeforeEach
    void setUp() {
        bucket = new FlowerBucket();
        flower = new Flower(FlowerType.TULIP);
        flower.setPrice(30);
        flowerPack = new FlowerPack(3, flower);
        ((FlowerBucket)bucket).addFlowerPack(flowerPack);
    }

    @Test
    void testPaperDecorator() {
        bucket = new PaperDecorator(bucket);
        assertEquals(103, bucket.getPrice());
        assertEquals("FlowerBucket(flowerPacksList=" +
                "[FlowerPack(amount=3, " +
                "flower=Flower(sepalLength=0.0, price=30.0, flowerType=TULIP, " +
                "color=null))]), " +
                "Decorated with paper", bucket.getDescription());
    }

    @Test
    void testBasketDecorator() {
        bucket = new BasketDecorator(bucket);
        assertEquals(94, bucket.getPrice());
        assertEquals("FlowerBucket(flowerPacksList=" +
                "[FlowerPack(amount=3, " +
                "flower=Flower(sepalLength=0.0, price=30.0, flowerType=TULIP, " +
                "color=null))]), " +
                "Decorated with basket", bucket.getDescription());
    }

    @Test
    void testRibbonDecorator() {
        bucket = new RibbonDecorator(bucket);
        assertEquals(130, bucket.getPrice());
        assertEquals("FlowerBucket(flowerPacksList=" +
                "[FlowerPack(amount=3, " +
                "flower=Flower(sepalLength=0.0, price=30.0, flowerType=TULIP, " +
                "color=null))]), " +
                "Decorated with ribbon", bucket.getDescription());
    }

}