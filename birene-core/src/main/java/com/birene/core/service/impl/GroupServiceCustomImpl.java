package com.birene.core.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.transaction.annotation.Transactional;

import com.birene.core.dto.GroupInfo;
import com.birene.core.models.Group;
import com.birene.core.reference.GroupType;
import com.birene.core.service.GroupService;
import com.birene.core.service.GroupServiceCustom;
import com.tyrael.commons.dto.PageInfo;
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
    public List<GroupInfo> transactionalFindByType(GroupType level, boolean enabled, Sort sort) {
        return toDto(service.findByTypeAndEnabled(level, enabled, sort));
    }

    @Override
    public PageInfo<GroupInfo> page(GroupType type, Sort sort, int page, int count) {
        Pageable pageable = new PageRequest(page, count, sort);
        Page<Group> records = service.findByType(type, pageable);
        List<GroupInfo> groupInfos = toDto(records);
        PageInfo<GroupInfo> pageResponse = new PageInfo<>();
        pageResponse.setData(groupInfos);
        pageResponse.setTotal(records.getTotalElements());
        return pageResponse;
    }

}
