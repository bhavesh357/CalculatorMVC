package com.bl.test.controller;


import com.bl.test.service.CalculatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class CalculatorResultController {

    private CalculatorService service=new CalculatorService();

    @RequestMapping("/result")
    public String printAdd(ModelMap modelMap,HttpServletRequest request,HttpServletResponse response){

        int first = Integer.parseInt(request.getParameter("first"));
        int second = Integer.parseInt(request.getParameter("second"));
        String operation = request.getParameter("operation");
        modelMap.addAttribute("message",service.getResult(first,second,operation));
        return "result";
    }

}
