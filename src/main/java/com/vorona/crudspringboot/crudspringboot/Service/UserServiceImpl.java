package com.vorona.crudspringboot.crudspringboot.Service;

import com.vorona.crudspringboot.crudspringboot.DAO.UserDaoImpl;
import com.vorona.crudspringboot.crudspringboot.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    final UserDaoImpl userDao;
    @Autowired
    public UserServiceImpl(UserDaoImpl userDao) {
        this.userDao = userDao;
    }

    @Override
    public List<User> getUser() {
        return userDao.getUser();
    }
    public void save (User user) {
        userDao.save(user);
    }
    public User show (Long id) {
        return userDao.show(id);
    }
    public void update(Long id, User updareUser) {
        userDao.update(id,updareUser);
    }
    public void delete(Long id) {
        userDao.delete(id);
    }
}
