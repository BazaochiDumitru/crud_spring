package com.bazaochi.crud_spring.service;

import org.springframework.stereotype.Component;

import java.util.Map;

@Component
public class BeanService {

    public Map<String, String> beanMethod() {
        return Map.of("test", "hello from beanService");
    }
}
