package com.vorona.crudspringboot.crudspringboot.repository;

import com.vorona.crudspringboot.crudspringboot.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
