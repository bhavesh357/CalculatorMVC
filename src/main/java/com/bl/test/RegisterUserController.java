package com.bl.test;

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
@RequestMapping("/registeruser")
public class RegisterUserController {

    @RequestMapping(method = RequestMethod.POST)
    protected String doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        String username = request.getParameter("username");
        String email = request.getParameter("email");
        String password = request.getParameter("password");
        try {
            UserDAO.insertUser(username,email, password);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return "register";
    }
}
