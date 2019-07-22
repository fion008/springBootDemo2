package com.springboot.controller;


import com.springboot.entity.Lotterydata;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
@RequestMapping("/common")
public class TestController {

    @RequestMapping("/send")
    public  String sendMessage(){
        return "hello word";
    }


    @RequestMapping("/receive")
    public String receiveMessage(String  meassage){

        return meassage;
    }
}
