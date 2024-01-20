package com.bazaochi.crud_spring.controller;

import com.bazaochi.crud_spring.service.BeanService;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@SpringBootApplication
@RequiredArgsConstructor
public class BeanController {

    private final BeanService beanService;

    @GetMapping("/mock")
    public Map<String, String> beanMethod() {
        return beanService.beanMethod();
    }

}
