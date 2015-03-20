package com.birene.core.dto;

import java.util.List;

import com.birene.core.reference.GroupType;

/**
 * @author mbmartinez
 */
public class GroupInfo extends BaseNamedDto {

    private String code;
    private GroupType type;
    private PersonInfo personInCharge;
    private List<PersonInfo> instructors;
    private List<GroupInfo> children;

    public List<GroupInfo> getChildren() {
        return children;
    }

    public void setChildren(List<GroupInfo> children) {
        this.children = children;
    }

    public GroupType getType() {
        return type;
    }

    public void setType(GroupType type) {
        this.type = type;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public PersonInfo getPersonInCharge() {
        return personInCharge;
    }

    public void setPersonInCharge(PersonInfo personInCharge) {
        this.personInCharge = personInCharge;
    }

    public List<PersonInfo> getInstructors() {
        return instructors;
    }

    public void setInstructors(List<PersonInfo> instructors) {
        this.instructors = instructors;
    }

}
