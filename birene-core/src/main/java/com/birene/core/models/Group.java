package com.birene.core.models;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

import com.baldy.commons.models.BaseNamedEntity;
import com.birene.core.reference.GroupType;

@Entity(name = "TUTORIAL_GROUP")
public abstract class Group extends BaseNamedEntity {

    @Enumerated(EnumType.STRING)
    private GroupType type;

    public GroupType getType() {
        return type;
    }

    public void setType(GroupType type) {
        this.type = type;
    }

}
