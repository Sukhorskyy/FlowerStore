package Flowers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StoreTest {
    private Flower rose;
    private Flower tulip;
    private Store store;

    @BeforeEach
    void setUp() {
        rose = new Flower(FlowerType.ROSE);
        rose.setPrice(25);
        rose.setColor(Color.YELLOW);
        rose.setSepalLength(16);

        tulip = new Flower(FlowerType.TULIP);
        tulip.setPrice(21);
        tulip.setColor(Color.BLUE);
        tulip.setSepalLength(12);

        store = new Store();
        store.addPack(rose, 100);
        store.addPack(tulip, 160);
    }

    @Test
    void testAddPack() {
        assertEquals("Store(flowerPacksList=" +
                "[FlowerPack(amount=100, flower=Flower(sepalLength=16.0, price=25.0, flowerType=ROSE, color=YELLOW)), " +
                "FlowerPack(amount=160, flower=Flower(sepalLength=12.0, price=21.0, flowerType=TULIP, color=BLUE))])",
                store.toString());
    }

    @Test
    void testSearch() {
        FlowerPack rosePack = new FlowerPack(100, rose);
        FlowerPack tulipPack = new FlowerPack(160, tulip);
        assertEquals(rosePack, store.search(rose));
        assertEquals(tulipPack, store.search(tulip));
    }

}