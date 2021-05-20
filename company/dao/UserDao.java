package company.dao;

import company.model.User;
import java.util.ArrayList;

public class UserDao {
  private final ArrayList<User> users = new ArrayList<>();

    public ArrayList<User> getUsers() { return users; }
    public void setUsers(User user) {
        this.users.add(user);
    }
}
