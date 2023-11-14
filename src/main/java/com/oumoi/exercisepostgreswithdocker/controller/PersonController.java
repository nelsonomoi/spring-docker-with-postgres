package com.oumoi.exercisepostgreswithdocker.controller;


import com.oumoi.exercisepostgreswithdocker.entity.Person;
import com.oumoi.exercisepostgreswithdocker.entity.PersonRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/person")
@RequiredArgsConstructor
public class PersonController {

    private final PersonRepository personRepository;

    record PersonDto(String name){};


    @PostMapping("")
    Person  createPerson(@RequestBody PersonDto personDto){
        Person person = new Person();
        person.setName(personDto.name);
        return this.personRepository.save(person);
    }

    @GetMapping("")
    List<Person> fetchPersons(){
        return this.personRepository.findAll();
    }

}
