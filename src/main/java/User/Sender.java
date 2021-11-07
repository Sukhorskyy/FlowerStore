package User;

import lombok.ToString;

@ToString
public class Sender implements User {
    private static int idCounter = 1;
    private int id = 0;

    public Sender() {
        idCounter = idCounter + 2;
        id = idCounter;
    }

    @Override
    public void update() {
        System.out.println("Your order is sent");
    }

    @Override
    public int getId() {
        return id;
    }
}
