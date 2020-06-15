package com.bl.test;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
@RequestMapping("/")
public class CalculatorController {

    @RequestMapping(method = RequestMethod.GET)
    public String printWelcome(){
        return "welcome";
    }
}
