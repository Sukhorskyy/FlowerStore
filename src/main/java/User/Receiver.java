package User;

import lombok.ToString;

@ToString
public class Receiver implements User {
    private static int idCounter = 0;
    private int id = 0;

    public Receiver() {
        idCounter = idCounter + 2;
        id = idCounter;
    }

    @Override
    public void update() {
        System.out.println("You can receive your order");
    }

    @Override
    public int getId() {
        return id;
    }
}
