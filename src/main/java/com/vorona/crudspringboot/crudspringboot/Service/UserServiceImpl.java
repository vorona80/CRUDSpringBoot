package com.vorona.crudspringboot.crudspringboot.Service;

import com.vorona.crudspringboot.crudspringboot.model.User;
import com.vorona.crudspringboot.crudspringboot.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;
    @Autowired
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public List<User> getUser() {
        return userRepository.findAll();
    }
    public void save (User user) {
        userRepository.save(user);
    }
    public User show (Long id) {
        return userRepository.getReferenceById(id);
    }
    public void update(Long id, User updareUser) {
        userRepository.save(updareUser);
    }
    public void delete(Long id) {
        userRepository.deleteById(id);
    }
}
