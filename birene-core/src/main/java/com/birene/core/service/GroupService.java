package com.birene.core.service;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;

import com.birene.core.models.Group;
import com.birene.core.reference.GroupType;

/**
 * @author mbmartinez
 */
public interface GroupService extends JpaRepository<Group, Long>, GroupServiceCustom {

    boolean ENABLED = true;
    boolean DISABLED = false;

    List<Group> findByType(GroupType level, Sort sort);
    List<Group> findByTypeAndEnabled(GroupType level, boolean enabled, Sort sort);

}
