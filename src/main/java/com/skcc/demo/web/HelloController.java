package com.skcc.demo.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.skcc.demo.domain.Hello;

@RestController
public class HelloController {

    private static final String strDefine = "Hello, %s!";

    @GetMapping("/hello")
    public Hello handleWelcome(@RequestParam(value = "name", defaultValue = "World") String name) {
        return new Hello(String.format(strDefine, name));
    }

}
