/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wsb.webappservlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AppServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request,
            HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("name");
        String surname = request.getParameter("surname");
         
        System.out.println("name: " + name);
        System.out.println("sur: " + surname);
        
        PrintWriter writer = response.getWriter();
         
        String htmlRespone = "<html>";
        htmlRespone += "<h2>Your username is: " + name + "<br/>";      
        htmlRespone += "Your password is: " + surname + "</h2>";    
        htmlRespone += "</html>";

        writer.println(htmlRespone);        
    }
}
