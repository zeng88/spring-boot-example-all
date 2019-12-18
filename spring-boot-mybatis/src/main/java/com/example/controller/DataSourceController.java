package com.example.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DataSourceController {

    @RequestMapping(value = "/welcome")
    public String demoReturnSuccess() {
        return "Hello World";
    }

}
