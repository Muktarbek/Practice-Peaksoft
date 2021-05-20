package company;

import company.model.User;
import company.model.newenum.Gender;
import company.service.UserService;
import company.service.impl.UserServiceImpl;

public class Main {
    public static void main(String[] args) {
        User user1 = new User(1,"Muktarbek",20, Gender.MAN);
        User user2 = new User(2,"Nazgul",25, Gender.WOMAN);
        User user3 = new User(3,"Ulukbek",29, Gender.WOMAN);

        UserService userService = new UserServiceImpl();
        userService.addUser(user1);
        userService.addUser(user2);
        userService.addUser(user3);

        userService.searchUser(1);
        System.out.println();
        userService.users();
        userService.removeUser(2);
        System.out.println();
        userService.users();
    }
}
