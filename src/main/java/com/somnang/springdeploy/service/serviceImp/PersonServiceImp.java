package com.somnang.springdeploy.service.serviceImp;

import com.somnang.springdeploy.model.Person;
import com.somnang.springdeploy.repository.PersonRepository;
import com.somnang.springdeploy.service.PersonService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonServiceImp implements PersonService {
    private final PersonRepository repository;

    public PersonServiceImp(PersonRepository repository) {
        this.repository = repository;
    }

    @Override
    public Person addPerson(Person person) {
        return  repository.addNewPerson(person);
    }

    @Override
    public List<Person> getAllPeople() {
        return repository.getAllPeople();
    }
}
