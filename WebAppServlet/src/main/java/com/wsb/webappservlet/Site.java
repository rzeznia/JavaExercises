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
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Site {
     public void Site(){};
     public void submit()
    {
        komunikat = "Twoje imie to " + Imie + " Oraz nazwisko " + "Rzeźnik";  
    }

     private String Imie;
     private String komunikat;
     /**
     * Creates a new instance of Site
     */
    
    
}
