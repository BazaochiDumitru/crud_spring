package com.bazaochi.crud_spring.repository;

import com.bazaochi.crud_spring.entity.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TeacherRepository extends JpaRepository<Teacher, Long> {

    List<Teacher> findAllByAge(Integer age);
}
