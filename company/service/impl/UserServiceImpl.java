package company.service.impl;

import company.dao.UserDao;
import company.model.User;
import company.service.UserService;

public class UserServiceImpl implements UserService {

     UserDao userDao = new UserDao();
     
    @Override
    public void addUser(User input) {
     userDao.setUsers(input);
    }

    @Override
    public void searchUser(int input) {
       userDao.getUsers().stream().filter(x-> x.getId()==input).forEach(System.out::println);
    }

    @Override
    public  void removeUser(int input) {
      User m = userDao.getUsers().stream().filter(x->x.getId() == input).findFirst().get();
      userDao.getUsers().remove(m);
    }

    @Override
    public void users() {
        userDao.getUsers().forEach(System.out::println);
    }
}
