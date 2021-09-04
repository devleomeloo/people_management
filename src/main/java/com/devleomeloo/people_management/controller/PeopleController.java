package com.devleomeloo.people_management.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/corinthians")
public class PeopleController {

    @GetMapping
    public String test(){
        return "Vai Corinthians!!!!";
    }
}
