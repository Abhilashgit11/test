package com.example.test;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PersonRepo extends CrudRepository<Person, Person> {

    @Query(
            value = "SELECT * FROM Person",
            nativeQuery = true)
    List<Person> findPerson();
}
