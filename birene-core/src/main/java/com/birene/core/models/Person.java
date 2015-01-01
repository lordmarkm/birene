package com.birene.core.models;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

import com.birene.core.reference.PersonType;

@Entity(name = "PERSON")
public class Person extends com.baldy.commons.models.proper.Person {

    @Enumerated(EnumType.STRING)
    private PersonType type;

    public PersonType getType() {
        return type;
    }

    public void setType(PersonType type) {
        this.type = type;
    }

}
