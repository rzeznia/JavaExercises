/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wsb.collectiontofileandlogging;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import lombok.extern.log4j.Log4j2;

/**
 *
 * @author mrzeznix
 */
@Log4j2
public class Program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Program p = new Program();
        p.obsluga();
    }
    
    public void obsluga()
    {
        log.info("Start metody obsługa");
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> lista = new ArrayList<>();
        
        //TODO: wcczytanie w petli np 5 liczb i dodanie do kolekcji
        for(int i=0; i<5; i++)
        {
            Integer liczba = scanner.nextInt();
            log.info("Wczytano {}",liczba);
            lista.add(liczba);
        }
        String path = "C:\\Users\\mrzeznix\\Documents\\java\\file.txt";
        try (FileWriter writer = new FileWriter(path);)
        {
            writer.write(lista.toString());
        }catch(IOException e)
        {
            log.error("Nie udalo sie ",e);
        }
        
    }
    
}
