package com.bazaochi.crud_spring.repository;

import com.bazaochi.crud_spring.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Long> {

    List<User> findAllByAge(Integer age);
}
