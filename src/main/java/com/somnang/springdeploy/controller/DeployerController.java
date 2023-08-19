package com.somnang.springdeploy.controller;
import com.somnang.springdeploy.model.Person;
import com.somnang.springdeploy.service.PersonService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
public class DeployerController {
    private final PersonService service;

    public DeployerController(PersonService service) {
        this.service = service;
    }

    @PostMapping("/person")
  public ResponseEntity<?> addNewPerson(@RequestBody Person person){
        return ResponseEntity.ok().body(service.addPerson(person));
    }
    @GetMapping("/person")
    public ResponseEntity<?> getPeople(){
        return ResponseEntity.ok().body(service.getAllPeople());
    }

}
