package com.devleomeloo.people_management.utils;

import com.devleomeloo.people_management.dto.request.PersonDTO;
import com.devleomeloo.people_management.entity.Person;

import java.time.LocalDate;
import java.util.Collections;

public class PersonUtils {

    private static final String FIRST_NAME = "Leonardo";
    private static final String LAST_NAME = "Melo";
    private static final String CPF_NUMBER = "756.335.950-84";
    private static final long PERSON_ID =1L;
    public static final LocalDate BIRTHDATE = LocalDate.of(1994,03,15);

    public static PersonDTO createFakeDTO(){

        return PersonDTO.builder()
                .firstName(FIRST_NAME)
                .lastName(LAST_NAME)
                .cpf(CPF_NUMBER)
                .birthDate("15-03-1994")
                .phones(Collections.singletonList(PhoneUtils.createFakeDTO()))
                .build();
    }

    public static Person createFakeEntity(){

        return Person.builder()
                .id(PERSON_ID)
                .firstName(FIRST_NAME)
                .lastName(LAST_NAME)
                .cpf(CPF_NUMBER)
                .birthDate(BIRTHDATE)
                .phones(Collections.singletonList(PhoneUtils.createFakeEntity()))
                .build();
    }
}
