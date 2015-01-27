package com.birene.core.models;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import org.codehaus.jackson.annotate.JsonBackReference;

import com.baldy.commons.models.BaseNamedEntity;
import com.birene.core.reference.GroupType;

@Entity(name = "TUTORIAL_GROUP")
public class Group extends BaseNamedEntity {

    @Column(name = "CODE", nullable = false)
    private String code;

    @Enumerated(EnumType.STRING)
    @Column(name = "TYPE", nullable = false)
    private GroupType type;

    @ManyToOne
    @JoinColumn(name = "PARENT_ID")
    private Group parent;
    
    @OneToMany(mappedBy = "parent")
    private List<Group> children;

    public GroupType getType() {
        return type;
    }

    public void setType(GroupType type) {
        this.type = type;
    }

    @JsonBackReference
    public Group getParent() {
        return parent;
    }

    public void setParent(Group parent) {
        this.parent = parent;
    }

    public List<Group> getChildren() {
        return children;
    }

    public void setChildren(List<Group> children) {
        this.children = children;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

}
