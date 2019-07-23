package com.kuhn.kuhnsblog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class HomeController {

@RequestMapping(value = "/index")
    public String home(){
        return "blog/home" ;
    }
}
