package com.birene.core.service;

import java.util.List;

import org.springframework.data.domain.Sort;

import com.birene.core.dto.GroupInfo;
import com.birene.core.reference.GroupType;

public interface GroupServiceCustom {

    List<GroupInfo> transactionalFindByType(GroupType level, boolean enabled, Sort sort);

}
