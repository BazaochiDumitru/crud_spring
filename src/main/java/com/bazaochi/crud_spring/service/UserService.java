package com.bazaochi.crud_spring.service;

import com.bazaochi.crud_spring.entity.User;
import com.bazaochi.crud_spring.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    public void save(User user) {
        userRepository.save(user);
    }

    public void update(User user, Long id) {
        user.setId(id);
        userRepository.save(user);
    }

    public List<User> findAll() {
        return userRepository.findAll();
    }

    public User getOne(Long id) {
        return userRepository.findById(id).orElseThrow(RuntimeException::new);
    }

    public void delete(Long id) {
        var teacher = getOne(id);
        userRepository.delete(teacher);
    }
}
