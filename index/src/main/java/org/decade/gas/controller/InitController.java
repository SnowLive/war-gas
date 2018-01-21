package org.decade.gas.controller;

import org.decade.gas.biz.NewsBiz;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Class For:
 *
 * @auther: decade
 * @date: 17-12-25
 */
@Controller
@RequestMapping("/init")
public class InitController {
    @Autowired
    private NewsBiz newsBiz;

    @ResponseBody
    @RequestMapping(value = "/news", method = RequestMethod.GET)
    public Object listNews() {
        return newsBiz.listNews();
    }

    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public String index() {
        return "index";
    }

    @RequestMapping(value = "/officials", method = RequestMethod.GET)
    public String toOfficialsList() {
        return "officials_list";
    }

    @RequestMapping(value = "/error1", method = RequestMethod.GET)
    public String toError1() {
        return "404-dark";
    }

    @RequestMapping(value = "/error2", method = RequestMethod.GET)
    public String toError2() {
        return "404-light";
    }

    @RequestMapping(value = "/etst", method = RequestMethod.GET)
    public String test() {
        return "404-light";
    }


}
