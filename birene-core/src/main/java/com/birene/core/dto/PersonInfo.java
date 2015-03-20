package com.birene.core.dto;

import com.birene.core.reference.PersonType;
import com.tyrael.commons.dto.NameInfo;

/**
 * @author mbmartinez
 */
public class PersonInfo {

    private PersonType type;
    private String imageUrl;
    private NameInfo name;

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
    public NameInfo getName() {
        return name;
    }
    public void setName(NameInfo name) {
        this.name = name;
    }

}
