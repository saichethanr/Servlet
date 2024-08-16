package org.example;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


//if u want to activate a servlet we have to send a request to the servlet

public class HelloServlet extends HttpServlet {
    public void service(HttpServletRequest req, HttpServletResponse res){
        System.out.println("in service");
    }
}
