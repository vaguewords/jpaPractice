package com.springdatajpa.practice.product.controller;

import org.springframework.web.bind.annotation.GetMapping;

public class MainController {
    @GetMapping(value = {"/", "/main"})
    public String main() {
        return "/main/main";
    }
}
