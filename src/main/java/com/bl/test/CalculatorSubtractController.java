package com.bl.test;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/subtract")
public class CalculatorSubtractController {

    @RequestMapping(method = RequestMethod.GET)
    public String printWelcome(ModelMap modelMap){
        modelMap.addAttribute("message","Its Subtract");
        return "subtract";
    }
}
