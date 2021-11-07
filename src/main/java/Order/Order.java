package Order;

import User.User;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
public class Order {
    private List<User> users = new ArrayList<User>();

    public Order(QuickOrder type) {}
    public Order() {}

    public void addUser(User user) {
        users.add(user);
    }

    public void removeUser(User user) {
        for (int i = 0; i < users.size(); i++) {
            if (users.get(i).getId() == user.getId()) {
                users.remove(i);
            }
        }
    }

    public void notifyUser() {
        for (int i = 0; i < users.size(); i++) {
            users.get(i).update();
        }
    }

    public void order() {
        this.notifyUser();
    }
}
