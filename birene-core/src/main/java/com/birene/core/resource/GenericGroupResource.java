package com.birene.core.resource;

import static org.springframework.http.HttpStatus.OK;
import static org.springframework.web.bind.annotation.RequestMethod.GET;

import java.security.Principal;

import org.slf4j.Logger;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.baldy.commons.web.controller.GenericController;
import com.birene.core.dto.GroupInfo;
import com.birene.core.reference.GroupType;
import com.birene.core.service.GroupService;
import com.tyrael.commons.dto.PageInfo;

/**
 * @author mbmartinez
 * @param <T>
 */
public abstract class GenericGroupResource
    extends GenericController {

    protected abstract GroupService groupService();
    protected abstract GroupType groupType();
    protected abstract Logger logger();

    @RequestMapping(method = GET)
    public ResponseEntity<PageInfo<GroupInfo>> page(Principal principal,
            @RequestParam int page,
            @RequestParam int count) {

        logger().debug("User query. Principal={}", name(principal));

        PageInfo<GroupInfo> pageResponse = groupService().page(groupType(), null, page, count);
        return new ResponseEntity<>(pageResponse, OK);
    }

}
