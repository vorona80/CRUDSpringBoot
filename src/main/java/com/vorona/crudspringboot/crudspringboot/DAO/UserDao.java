package com.vorona.crudspringboot.crudspringboot.DAO;

import com.vorona.crudspringboot.crudspringboot.model.User;
import java.sql.SQLException;
import java.util.List;

public interface UserDao {
    public List<User> getUser(/*int count*/) throws SQLException;
    public void save (User user);
    public User show (Long id);
    public void update(Long id, User updareUser);
    public void delete(Long id);
}
