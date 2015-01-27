package com.birene.core.dto;

import java.util.List;

import com.birene.core.reference.GroupType;

/**
 * @author mbmartinez
 */
public class GroupInfo extends BaseNamedDto {

    private GroupType type;
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

}
