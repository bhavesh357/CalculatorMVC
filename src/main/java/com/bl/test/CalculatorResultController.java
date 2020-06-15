package com.bl.test;


import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
@RequestMapping("*")
public class CalculatorResultController {

    @RequestMapping("/add")
    public String printAdd(ModelMap modelMap,HttpServletRequest request,HttpServletResponse response){

        int first = Integer.parseInt(request.getParameter("first"));
        int second = Integer.parseInt(request.getParameter("second"));
        modelMap.addAttribute("message","Addition of "+first+" and "+second+" is "+(first+second));
        return "result";
    }

    @RequestMapping("/subtract")
    public String printSubtract(ModelMap modelMap,HttpServletRequest request,HttpServletResponse response){

        int first = Integer.parseInt(request.getParameter("first"));
        int second = Integer.parseInt(request.getParameter("second"));
        modelMap.addAttribute("message","Subtraction of "+first+" and "+second+" is "+(first-second));
        return "result";
    }

    @RequestMapping("/multiply")
    public String printMultiply(ModelMap modelMap,HttpServletRequest request,HttpServletResponse response){

        int first = Integer.parseInt(request.getParameter("first"));
        int second = Integer.parseInt(request.getParameter("second"));
        modelMap.addAttribute("message","Multiplication of "+first+" and "+second+" is "+first*second);
        return "result";
    }
    @RequestMapping("/divide")
    public String printDivide(ModelMap modelMap,HttpServletRequest request,HttpServletResponse response){

        int first = Integer.parseInt(request.getParameter("first"));
        int second = Integer.parseInt(request.getParameter("second"));
        modelMap.addAttribute("message","Division of "+first+" and "+second+" is "+first/second);
        return "result";
    }



}
