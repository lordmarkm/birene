package com.birene.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.baldy.commons.web.controller.GenericController;
import static org.springframework.web.bind.annotation.RequestMethod.GET;

/**
 * Basic index controller, returns base index.jsp
 * @author Mark Martinez
 */
@Controller
public class IndexController extends GenericController {

    @RequestMapping(value = "/", method = GET)
    public ModelAndView index() {
        return mav("index");
    }

}
