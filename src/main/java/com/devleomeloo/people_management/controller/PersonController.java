package com.devleomeloo.people_management.controller;

import com.devleomeloo.people_management.dto.MessageResponseDTO;
import com.devleomeloo.people_management.entity.Person;
import com.devleomeloo.people_management.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/corinthians")
public class PersonController {

    private PersonRepository personRepository;

    @Autowired
    public PersonController(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    @PostMapping
    public MessageResponseDTO createPerson(@RequestBody Person person){
        Person savedPerson = personRepository.save(person);
        return MessageResponseDTO
                .builder()
                .message("Created person with DTO")
                .build();
    }
}
