package com.xwh.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JspController {

    @RequestMapping("/jsp")
    public String jsp(){
        return "/hello_jsp";
    }
}
