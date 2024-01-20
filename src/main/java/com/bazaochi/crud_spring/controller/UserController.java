package com.bazaochi.crud_spring.controller;

import com.bazaochi.crud_spring.entity.User;
import com.bazaochi.crud_spring.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/users")
public class UserController {

    private final UserService userService;

    @GetMapping("/{id}")
    public User getOne(@PathVariable Long id) {
        return userService.getOne(id);
    }

    @PostMapping
    public void save(@RequestBody User user) {
        userService.save(user);
    }

    @PostMapping("/{id}")
    public void update(@RequestBody User user, @PathVariable Long id) {
        userService.update(user, id);
    }

    @GetMapping
    public List<User> findAll() {
        return userService.findAll();
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        userService.delete(id);
    }
}
