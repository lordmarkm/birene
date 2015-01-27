package com.birene.core.resource;

import static org.springframework.http.HttpStatus.OK;
import static org.springframework.web.bind.annotation.RequestMethod.GET;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.birene.core.dto.GroupInfo;
import com.birene.core.reference.GroupType;
import com.birene.core.service.GroupService;

@RestController
@RequestMapping("/level")
public class LevelResource {

    @Autowired
    private GroupService groupService;

    @RequestMapping(method = GET)
    @Transactional
    public ResponseEntity<List<GroupInfo>> getLevels() {
        Sort sort = new Sort(Direction.ASC, "id");
        List<GroupInfo> levels = groupService.transactionalFindByType(GroupType.LEVEL, sort);
        return new ResponseEntity<List<GroupInfo>>(levels, OK);
    }

}
