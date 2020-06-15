package com.bl.test;


import com.bl.test.model.User;
import com.bl.test.model.UserDAO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;


@Controller
@RequestMapping("/welcome")
public class CalculatorController {
    private String message;
    @RequestMapping(method = RequestMethod.POST)
    public String printWelcome(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String email = request.getParameter("email");
        String pwd = request.getParameter("password");
        User user = null;
        try {
            user = UserDAO.getUser(email,pwd);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        if (user!=null){
            return "welcome";
        }else{
            RequestDispatcher rd = request.getServletContext().getRequestDispatcher("/login.jsp");
            message ="<h4 style=\"color:red\">Either username or password is wrong</h4>";
            request.setAttribute("message", message);
            return "login";
        }
    }

    @RequestMapping(method = RequestMethod.GET)
    public String writeTest(){
        return "welcome";
    }
}
