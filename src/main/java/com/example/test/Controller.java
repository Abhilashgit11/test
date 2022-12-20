package com.example.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Controller {
    @Autowired
    PersonService personService = new PersonService();

    @GetMapping("/test")
    public List<Person> test() {
        return personService.getAllPersons();
    }
}
