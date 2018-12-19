package com.geekq.controller;

import com.geekq.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/j")
public class TestController {
    @Autowired
    private TestService testService;

    @RequestMapping(value = "/user",method = RequestMethod.GET)
    public String gettest(){
        testService.getTest();
        System.out.println("222222");
return null;
    }
}
