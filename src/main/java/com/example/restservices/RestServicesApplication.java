package com.example.restservices;

import com.example.restservices.user.User;
import com.example.restservices.user.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalDate;
import java.util.stream.Stream;

@SpringBootApplication
public class RestServicesApplication {

    public static void main(String[] args) {
        SpringApplication.run(RestServicesApplication.class, args);
    }

    //create a commandline runner to add users to the database
    /*@Bean
    CommandLineRunner init(UserRepository userRepository) {
        return args -> {
            Stream.of("John", "Julie", "Jennifer", "Helen", "Rachel").forEach(name -> {
                User user = new User(name, LocalDate.now().minusYears(25));
                userRepository.save(user);
            });
            userRepository.findAll().forEach(System.out::println);
        };
    }*/

}
