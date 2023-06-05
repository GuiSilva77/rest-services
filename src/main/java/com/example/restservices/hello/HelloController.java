package com.example.restservices.hello;

import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Locale;

@RestController
public class HelloController {

    private MessageSource messageSource;

    public HelloController(MessageSource messageSource) {
        this.messageSource = messageSource;
    }

    @GetMapping("/hello")
    public String HelloWord() {
        Locale locale = LocaleContextHolder.getLocale();

        messageSource.getMessage("good.morning.message", null, "Default Message", locale);

        return "Hello World";
    }

}
