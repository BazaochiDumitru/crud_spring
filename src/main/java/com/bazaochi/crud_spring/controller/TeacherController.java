package com.bazaochi.crud_spring.controller;

import com.bazaochi.crud_spring.entity.Teacher;
import com.bazaochi.crud_spring.service.TeacherService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/teachers")
public class TeacherController {

    private final TeacherService teacherService;

    @GetMapping("/{id}")
    public Teacher getOne(@PathVariable Long id) {
        return teacherService.getOne(id);
    }

    @PostMapping
    public void save(@RequestBody Teacher teacher) {
        teacherService.save(teacher);
    }

    @PostMapping("/{id}")
    public void update(@RequestBody Teacher teacher, @PathVariable Long id) {
        teacherService.update(teacher, id);
    }

    @GetMapping
    public List<Teacher> findAll() {
        return teacherService.findAll();
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        teacherService.delete(id);
    }
}
