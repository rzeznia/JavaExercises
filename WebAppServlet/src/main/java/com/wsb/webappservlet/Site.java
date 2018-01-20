/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wsb.webappservlet;

/**
 *
 * @author mrzeznix
 */;

import java.io.PrintWriter;
import static java.lang.System.out;
import javax.ws.rs.core.Response;

public class Site {
     public void Site(){};
     public void setImie(String ImieGet)
     {
         this.Imie = ImieGet;
     }
     public String getImie()
     {
         return this.Imie;
     }
     private String Imie;
     /**
     * Creates a new instance of Site
     */
    public void submit()
    {
        out.println("<html><body>");
        out.println("<h1>My" + Imie + "</h2>");
        out.println("</body></html>");  
    }

    
}
