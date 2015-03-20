package com.birene.core.service;

import java.util.List;

import org.springframework.data.domain.Sort;

import com.birene.core.dto.GroupInfo;
import com.birene.core.reference.GroupType;
import com.tyrael.commons.dto.PageInfo;

/**
 * @author mbmartinez
 */
public interface GroupServiceCustom {

    List<GroupInfo> transactionalFindByType(GroupType level, boolean enabled, Sort sort);
    PageInfo<GroupInfo> page(GroupType type, Sort sort, int page, int count);

}
