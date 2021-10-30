package FlowerStore;

import Decorators.PaperDecorator;

public class Main {
    public static void main(String[] args) {
        Item bucket = new FlowerBucket();
        Flower flower = new Flower(FlowerType.TULIP);
        flower.setPrice(30);
        FlowerPack flowerPack = new FlowerPack(3, flower);
        ((FlowerBucket)bucket).addFlowerPack(flowerPack);
        bucket = new PaperDecorator(bucket);
        System.out.println(bucket.getDescription());
        System.out.println(bucket.getPrice());
    }
}
