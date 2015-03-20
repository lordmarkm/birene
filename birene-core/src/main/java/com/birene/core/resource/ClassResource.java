package com.birene.core.resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.birene.core.reference.GroupType;
import com.birene.core.service.GroupService;

/**
 * @author mbmartinez
 */
@RestController
@RequestMapping("/class")
public class ClassResource extends GenericGroupResource {

    private static final Logger LOG = LoggerFactory.getLogger(ClassResource.class);

    @Autowired
    private GroupService groupService;

    @Override
    protected GroupService groupService() {
        return groupService;
    }

    @Override
    protected GroupType groupType() {
        return GroupType.CLASS;
    }

    @Override
    protected Logger logger() {
        return LOG;
    }
}
