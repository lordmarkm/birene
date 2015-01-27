package com.birene.core.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.transaction.annotation.Transactional;

import com.birene.core.dto.GroupInfo;
import com.birene.core.models.Group;
import com.birene.core.reference.GroupType;
import com.birene.core.service.GroupService;
import com.birene.core.service.GroupServiceCustom;
import com.tyrael.commons.mapper.service.MappingService;

/**
 * @author mbmartinez
 */
@Transactional
public class GroupServiceCustomImpl extends MappingService<Group, GroupInfo>
    implements GroupServiceCustom {

    @Autowired
    private GroupService service;

    @Override
    public List<GroupInfo> transactionalFindByType(GroupType level, Sort sort) {
        return toDto(service.findByType(level, sort));
    }

}
