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
@RequestMapping("/course")
public class CourseResource extends GenericGroupResource {

    private static final Logger LOG = LoggerFactory.getLogger(CourseResource.class);

    @Override
    protected GroupType groupType() {
        return GroupType.COURSE;
    }

    @Override
    protected Logger logger() {
        return LOG;
    }
}
