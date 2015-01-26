package com.birene.core.service;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.birene.core.models.Person;
import com.birene.core.reference.PersonType;

/**
 * @author mbmartinez
 */
public interface PersonService extends JpaRepository<Person, Long> {

    List<Person> findByType(PersonType type);

}
