package com.springboot.controller;


import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@Controller
@SpringBootApplication
@RequestMapping("/index")
public class IndexController {

    @RequestMapping(value = "/get", method = RequestMethod.GET)
    public String sendMessage() {
        return "index";
    }

}
