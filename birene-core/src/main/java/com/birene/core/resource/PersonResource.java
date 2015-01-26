package com.birene.core.resource;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.birene.core.models.Person;
import com.birene.core.reference.PersonType;
import com.birene.core.service.PersonService;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@RestController
@RequestMapping("/person")
public class PersonResource {

    private static final Logger LOG = LoggerFactory.getLogger(PersonResource.class);

    @Autowired
    private PersonService personService;

    @RequestMapping(value = "/{type}", method = GET)
    public List<Person> findByType(@PathVariable PersonType type) {
        LOG.debug("Trying to find persons by type. type={}", type);
        return personService.findByType(type);
    }

}
