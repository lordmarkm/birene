package com.birene.core.service;

import org.springframework.data.jpa.repository.JpaRepository;

import com.birene.core.models.Group;

public interface GroupService extends JpaRepository<Group, Long> {

}
