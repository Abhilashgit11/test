package com.example.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PersonService {
    @Autowired
    PersonRepo personRepo;

    /*public List<Person> getAllPersons() {
        Person person = new Person(1, "A", 2, "C");
        ArrayList<Person> personList = new ArrayList<>();
        if (person.getStatus() == "C") {
            person.setStatus("Completed");
        }
        personList.add(person);
        return personList;
    }*/

    public List<Person> getAllPersons() {
        List<Person> personList = personRepo.findPerson();
        List<Person> ModifiedPersonList = new ArrayList<>();

        for (Person person : personList) {
            Person modifyPerson = new Person();
            if (person.getStatus().equals("C")) {
                person.setStatus("Completed");
            }
            ModifiedPersonList.add(person);

        }
        return ModifiedPersonList;
    }
}
