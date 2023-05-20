package com.vorona.crudspringboot.crudspringboot.Service;
import com.vorona.crudspringboot.crudspringboot.model.User;

import java.util.List;

public interface UserService {
    public List<User> getUser(/*int count*/);
    public void save (User user);
    public User show (Long id);
    public void update(Long id, User updareUser);
    public void delete(Long id);
}
