package com.birene.core.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

import com.birene.core.reference.PersonType;
import com.birene.core.util.HasLinkedImage;

@Entity(name = "PERSON")
public class Person extends com.baldy.commons.models.proper.Person implements HasLinkedImage {

    @Enumerated(EnumType.STRING)
    @Column(name = "PERSON_TYPE", nullable = false)
    private PersonType type;

    @Column(name = "IMG_URL")
    private String imageUrl;

    public PersonType getType() {
        return type;
    }

    public void setType(PersonType type) {
        this.type = type;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

}
