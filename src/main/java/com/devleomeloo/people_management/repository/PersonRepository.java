package com.devleomeloo.people_management.repository;

import com.devleomeloo.people_management.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {


}
