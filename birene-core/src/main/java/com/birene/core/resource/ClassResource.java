package com.birene.core.resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.birene.core.reference.GroupType;

/**
 * @author mbmartinez
 */
@RestController
@RequestMapping("/class")
public class ClassResource extends GenericGroupResource {

    private static final Logger LOG = LoggerFactory.getLogger(ClassResource.class);

    @Override
    protected GroupType groupType() {
        return GroupType.CLASS;
    }

    @Override
    protected Logger logger() {
        return LOG;
    }
}
