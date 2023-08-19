package com.somnang.springdeploy.service;

import com.somnang.springdeploy.model.Person;

import java.util.List;

public interface PersonService {
    Person addPerson(Person person);
    List<Person>getAllPeople();
}
