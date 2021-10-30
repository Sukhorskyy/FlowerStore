package FlowerStore;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FlowerTest {
    private Flower flower;
    private Flower flower2;

    @BeforeEach
    void setUp() {
        flower = new Flower(FlowerType.TULIP);
        flower.setPrice(15);
        flower.setColor(Color.YELLOW);
        flower.setSepalLength(12);
    }

    @Test
    void testPrice() {
        assertEquals(15, flower.getPrice());
    }

    @Test
    void testType() {
        assertEquals(FlowerType.TULIP, flower.getFlowerType());
    }

    @Test
    void testColor() {
        assertEquals(Color.YELLOW, flower.getColor());
    }

    @Test
    void testSepalLength() {
        assertEquals(12, flower.getSepalLength());
    }

    @Test
    void testEquals() {
        assertEquals(flower, flower);
        flower2 = new Flower(FlowerType.TULIP);
        flower2.setPrice(15);
        flower2.setColor(Color.YELLOW);
        flower2.setSepalLength(12);
        assertEquals(flower, flower2);
        assertEquals(flower2, flower);
        flower2.setPrice(30);
        assertFalse(flower.equals(flower2));
    }
}