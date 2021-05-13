package com.founder.docker.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class WebController {

    @RequestMapping("/index")
    public String index(){

        return "Hello World!";

    }
}
