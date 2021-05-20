package company.service;

import company.model.User;

public interface UserService {
    void addUser(User input);
    void searchUser(int input);
    void removeUser(int input);
    void users();
}
