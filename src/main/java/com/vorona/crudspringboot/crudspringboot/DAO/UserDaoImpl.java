package com.vorona.crudspringboot.crudspringboot.DAO;

import com.vorona.crudspringboot.crudspringboot.model.User;
import com.vorona.crudspringboot.crudspringboot.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import java.util.List;
import java.util.Optional;

@Component

public class UserDaoImpl implements UserDao {
    private final UserRepository userRepository;
    @Autowired
    public UserDaoImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> getUser() {
        return userRepository.findAll();
    }
    public User show(Long id) {
        return userRepository.getReferenceById(id);
    }

    public void save(User user) {
        userRepository.save(user);
    }
    public void update(Long id, User updareUser) {
        updareUser.setId(id);
        userRepository.save(updareUser);
    }
    public void delete(Long id) {
        userRepository.deleteById(id);
    }
}
