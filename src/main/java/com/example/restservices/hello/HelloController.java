package com.example.restservices.hello;

import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Locale;

@RestController
public class HelloController {



    @GetMapping("/hello")
    public String HelloWord() {

        return "Hello World";
    }

}
