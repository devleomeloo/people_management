package com.devleomeloo.people_management.controller;

import com.devleomeloo.people_management.dto.MessageResponseDTO;
import com.devleomeloo.people_management.dto.request.PersonDTO;
import com.devleomeloo.people_management.exception.PersonNotFoundException;
import com.devleomeloo.people_management.service.PersonService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/v1/people")
@AllArgsConstructor(onConstructor = @__(@Autowired))
@Api(value = "Api para gerenciar o cadastro de pessoas")
public class PersonController {

    private PersonService personService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    @ApiOperation(value = "Api para cadastrar uma pessoa")
    public MessageResponseDTO createPerson(@RequestBody @Valid PersonDTO personDTO){
        return personService.createPerson(personDTO);
    }

    @GetMapping
    @ApiOperation(value = "Api para listar todas as pessoas")
    public List<PersonDTO> listAll(){
        return personService.listAll();
    }

    @GetMapping("/{id}")
    @ApiOperation(value = "Api para listar uma pessoa por id")
    public PersonDTO findById(@PathVariable Long id) throws PersonNotFoundException {
        return personService.findById(id);
    }

    @PutMapping("/{id}")
    @ApiOperation(value = "Api para atualizar o cadastro de uma pessoa")
    public MessageResponseDTO updateById(@PathVariable Long id, @RequestBody PersonDTO personDTO) throws PersonNotFoundException {
        return personService.updateById(id, personDTO);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    @ApiOperation(value = "Api para deletar o cadastro de uma pessoa")
    public void deletById(@PathVariable Long id) throws PersonNotFoundException {
        personService.delete(id);
    }
}
